var Backbone = require('backbone');
var $ = require('jquery');
var _ = require('underscore');
var CollectionView = require('./collectionView');
var FormView = require('./formView');
var Collection = require('./collection');
var SearchView = require('./searchView');

module.exports = Backbone.Router.extend({
  subview: null,
  routes: {
    '': 'home',
    'home': 'home',
  },
  home: function () {
    var post = new Collection();
    post.fetch().then(function (data) {
      var colView = new CollectionView({collection: post});
      var addForm = new FormView({collection: post});
      var searchForm = new SearchView({collection: post});
      $('.create').html(addForm.render().el);
      $('.search').html(searchForm.render().el);
    });
  },
  renderSubview: function (subview) {
    this.subview && this.subview.remove();
    this.subview = subview;
  }
})


// var that = this; //constructor context
// var bitterCol = new BitterCollection();
// var bitFormView = new FormView({collection: bitterCol});
//
// bitterCol.fetch().then(function (data) {
//   var collection = new BitterCollection(data);
//   that.renderSubview(new BitterCollectionView({collection: collection}));
// });
// },

// //
// $(document).ready(function () {
//   var post = new Collection();
//   post.fetch().then(function (data) {
//     var colView = new CollectionView({collection: post});
//     var addForm = new FormView({collection: post});
//     var searchForm = new SearchView({collection: post});
//     $('.create').html(addForm.render().el);
//     $('.search').html(searchForm.render().el);
//   });
// });

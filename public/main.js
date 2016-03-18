var Backbone = require('backbone');
var $ = require('jquery');
var _ = require('underscore');
var CollectionView = require('./collectionView');
var FormView = require('./formView');
var Collection = require('./collection');

$(document).ready(function () {
  var post = new Collection();
  post.fetch().then(function (data) {
    new CollectionView({collection: post});
    var addForm = new FormView({collection: post});
    $('.create').html(addForm.render().el);
  });
});

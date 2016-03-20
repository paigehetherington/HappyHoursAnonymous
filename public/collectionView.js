var Backbone = require('backbone');
var $ = require('jquery');
var _ = require('underscore');
var ModelView = require('./modelView')

////// Collection View ///////

module.exports = Backbone.View.extend({
  el: '.content',
  initialize: function(){
    this.addAll();
    // this.listenTo(this.collection, 'change', this.addAll);
    this.listenTo(this.collection, 'update', this.addAll);
  },
  addOne: function(model){
    var modelView = new ModelView({model: model});
    this.$el.append(modelView.render().el);
  },
  addAll: function(){
    this.$el.html('');
    _.each(this.collection.models, this.addOne, this);
  }
})

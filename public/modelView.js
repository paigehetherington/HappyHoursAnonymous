var Backbone = require('backbone');
var $ = require('jquery');
var _ = require('underscore');
var tmpl = require('./templates');

////// Model View ///////

module.exports = Backbone.View.extend({
  template: _.template(tmpl.post),
  className: 'col-md-6',
  initalize: function(){
    this.listenTo(this.model, 'change', this.render);
    // this.listenTo(this.model, 'update', this.render);
    // this.listenTo(this.model, 'add', this.render);
  },
  events: {
    'click .delete': 'deletePost',
  },
  deletePost: function (event) {
    event.preventDefault();
    this.model.destroy();
  },
  render: function(){
    var markup = this.template(this.model.toJSON());
    this.$el.html(markup);
    return this;
  }
})

var Backbone = require('backbone');
var $ = require('jquery');
var _ = require('underscore');
var tmpl = require('./templates');

////// Model View ///////

module.exports = Backbone.View.extend({
  template: _.template(tmpl.post),
  initalize: function(){
    this.listenTo(this.model, 'change', this.render);
  },
  render: function(){
    var markup = this.template(this.model.toJSON());
    this.$el.html(markup);
    return this;
  }
})

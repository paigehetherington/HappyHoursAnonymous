var Backbone = require('backbone');
var $ = require('jquery');
var _ = require('underscore');
var tmpl = require('./templates');
var Model = require('./model')

////// Form View ///////

module.exports = Backbone.View.extend ({

  template: _.template(tmpl.create),
  events: {
    'click button': 'createPost',
  },
  createPost: function (event) {
    event.preventDefault();
    this.model.set({
      address: this.$el.find('input[name="address"]').val(),
      name: this.$el.find('input[name="name"]').val(),
      city: this.$el.find('#cityPick').val(),
      startTime: this.$el.find('input[name="startTime"]').val(),
      endTime: this.$el.find('input[name="endTime"]').val(),
      onMonday: this.$el.find('input[name="onMonday"]').attr("checked") ? 1 : 0,
      onTuesday: this.$el.find('input[name="onTuesday"]').attr("checked") ? 1 : 0,
      onWednesday: this.$el.find('input[name="onWednesday"]').attr("checked") ? 1 : 0,
      onThursday: this.$el.find('input[name="onThursday"]').attr("checked") ? 1 : 0,
      onFriday: this.$el.find('input[name="onFriday"]').attr("checked") ? 1 : 0,
      onSaturday: this.$el.find('input[name="onSaturday"]').attr("checked") ? 1 : 0,
      onSunday: this.$el.find('input[name="onSunday"]').attr("checked") ? 1 : 0,
      image: this.$el.find('input[name="image"]').val(),
      specials: this.$el.find('input[name="specials"]').val(),
    });
    this.model.save();
    this.collection.add(this.model);
    this.model = new Model({});
  },
  initialize: function () {
    if(!this.model) {
      this.model = new Model({});
    }
  },
  render: function () {
    var markup = this.template(this.model.toJSON());
    this.$el.html(markup);
    return this;
  }
})

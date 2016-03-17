module.exports = {
  post: [
    '<img src="<%= image %>" alt="" />',
    '<h3><%= name %></h3>',
    '<h5><%= address %></h5>',
    '<h5><%= phone %></h5>',
    '<p><span><%= onMonday %></span><span><%= onTuesday %></span><span><%= onWednesday %></span><span><%= onThursday %></span><span><%= onFriday %></span><span><%= onSaturday %></span><span><%= onSunday %></span></p>',
    '<p><%= startTime %> to <%= endTime %></p>',
    '<p><%= specials %></p>'
  ].join(''),

  create: [
    '<form class="">',
      '<h3>Add a Happy Hour!</h3>',
      '<input placeholder="Restaurant Name"type="text" name="name" value="">',
      '<input placeholder="Address"type="text" name="address" value="">',
      '<input placeholder="Phone Number"type="text" name="phone" value="">',
      '<input type="checkbox" name="onMonday">',
      '<label for="onMonday">Monday</label>',
      '<input type="checkbox" name="onTuesday">',
      '<label for="onTuesday">Tuesday</label>',
      '<input type="checkbox" name="onWednesday">',
      '<label for="onWednesday">Wednesday</label>',
      '<input type="checkbox" name="onThursday">',
      '<label for="onThursday">Thursday</label>',
      '<input type="checkbox" name="onFriday">',
      '<label for="onFriday">Friday</label>',
      '<input type="checkbox" name="onSaturday">',
      '<label for="onSaturday">Saturday</label>',
      '<input type="checkbox" name="onSunday">',
      '<label for="onSunday">Sunday</label>',
    '</form>'
  ].join(''),
},
nameSearch: [
  '<form class="">',
    '<input type="text" name="name" placeholder="Search By Restaurant">',
    '<button type="submit" name="search">Search</button>',
  '</form>',

].join(''),

citySearch: [
  '<select name="citySearch">',
    '<option>-- Choose Neighborhood --</option>',
    '<option>Downtown</option>',
    '<option>Mt. Pleasant</option>',
    '<option>West Ashley</option>',
    '<option>Park Circle</option>',
    '<option>Folly Beach</option>',
    '<option>Isle Of Palms</option>',
    '<option>Sullivans Island</option>',
    '<option>Summerville</option>',
    '<option>James Island</option>',
    '<option>James Island</option>',
  '</select>'
].join('')
}



// '<form class="">',
//   '<h3>Search for a Happy Hour!</h3>',
//   '<input placeholder="Restaurant Name"type="text" name="name" value="">',
//   '<input type="checkbox" name="onMonday">',
//   '<label for="onMonday">Monday</label>',
//   '<input type="checkbox" name="onTuesday">',
//   '<label for="onTuesday">Tuesday</label>',
//   '<input type="checkbox" name="onWednesday">',
//   '<label for="onWednesday">Wednesday</label>',
//   '<input type="checkbox" name="onThursday">',
//   '<label for="onThursday">Thursday</label>',
//   '<input type="checkbox" name="onFriday">',
//   '<label for="onFriday">Friday</label>',
//   '<input type="checkbox" name="onSaturday">',
//   '<label for="onSaturday">Saturday</label>',
//   '<input type="checkbox" name="onSunday">',
//   '<label for="onSunday">Sunday</label>',
// '</form>'

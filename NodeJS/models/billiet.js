var mongoose = require('mongoose');

var newsShemas = mongoose.Schema({
	destination: String,
	depart: String,
	prix: {
		type: Number,
		required: false
	},
	username: {
		type: String,
		required: false
	}
});
var billet = mongoose.model('billet', newsShemas, 'billet');
module.exports = billet;

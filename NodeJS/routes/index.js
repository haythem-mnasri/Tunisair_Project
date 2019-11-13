var express = require('express');
var router = express.Router();
var billiet = require('../models/billiet');



/* GET home page. */
router.post('/', function(req, res, next) {
	bill = new billiet();
	bill = req.body;

	billiet.insertMany(bill).then((data) => {
		res.send(data);
	});
});

/* GET home page. */
router.get('/', function(req, res, next) {
	billiet.find().then((data)=>res.json(data));
});


module.exports = router;

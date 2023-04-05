conn = new Mongo();
db = conn.getDB("mymongodb");

db.users.createIndex({ "name": 1 }, { unique: true });
db.users.insert({ "id": 1, "name": "kumar", "secret": "kumar1", "phone": "1234", "address": "TX, USA" });

db.products.createIndex({ "id" : 1 }, { unique: true })
db.products.createIndex({ "name" : 1 }, { unique: true })
db.products.insert({ "id": 1, "name": "Dell Latitude", "price": 100, "img": "latitude.jpg"});
db.products.insert({ "id": 2, "name": "Apple Macbook Pro", "price": 200, "img": "macbook.jpg"});

db.orders.createIndex({ "name": 1 }, { unique: false });
db.orders.insert({ "name": "kumar", "orderId": "1", "items": [ 1, 2 ] });

db.tutorials.createIndex({ "title" : 1 }, { unique: true })
db.tutorials.insert({ "title": "Angular 15 Basics", "description": "Tut#1 Description", "published": false});
db.tutorials.insert({ "title": "Spring Boot MongoDB", "description": "Tut#2 Description", "published": false});
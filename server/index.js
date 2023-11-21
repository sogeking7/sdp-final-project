const fs = require("fs");
const express = require("express");
const app = express();
const port = 3000;

app.get("/api/weapon/pistol", (req, res) => {
  fs.readFile("./data/pistol.json", "utf8", (err, data) => {
    if (err) {
      console.log(`Error reading file from disk: ${err}`);
      res.status(500).send("Server Error");
    } else {
      const jsonData = JSON.parse(data);
      res.json(jsonData);
    }
  });
});

app.get("/api/weapon/riflegun", (req, res) => {
  fs.readFile("./data/riflegun.json", "utf8", (err, data) => {
    if (err) {
      console.log(`Error reading file from disk: ${err}`);
      res.status(500).send("Server Error");
    } else {
      const jsonData = JSON.parse(data);
      res.json(jsonData);
    }
  });
});

app.get("/api/weapon/shotgun", (req, res) => {
  fs.readFile("./data/shotgun.json", "utf8", (err, data) => {
    if (err) {
      console.log(`Error reading file from disk: ${err}`);
      res.status(500).send("Server Error");
    } else {
      const jsonData = JSON.parse(data);
      res.json(jsonData);
    }
  });
});

app.listen(port, () => {
  console.log("Server started on port 3000");
});

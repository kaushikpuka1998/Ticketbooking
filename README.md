# TicketMasterBooking
``` json
{
  "openapi": "3.0.1",
  "info": {
    "title": "OpenAPI definition",
    "version": "v0"
  },
  "servers": [
    {
      "url": "http://localhost:8067",
      "description": "Generated server url"
    }
  ],
  "paths": {
    "/updateTheatreName/{theatre}": {
      "put": {
        "tags": [
          "theatre-controller"
        ],
        "operationId": "updateTheatreName",
        "parameters": [
          {
            "name": "theatre",
            "in": "path",
            "required": true,
            "schema": {
              "type": "string"
            }
          }
        ],
        "requestBody": {
          "content": {
            "application/json": {
              "schema": {
                "type": "string"
              }
            }
          },
          "required": true
        },
        "responses": {
          "200": {
            "description": "OK",
            "content": {
              "*/*": {
                "schema": {
                  "type": "string"
                }
              }
            }
          }
        }
      }
    },
    "/addMoviesInTheatre/{theatre}": {
      "put": {
        "tags": [
          "theatre-controller"
        ],
        "operationId": "addMoviesInTheatre",
        "parameters": [
          {
            "name": "theatre",
            "in": "path",
            "required": true,
            "schema": {
              "type": "string"
            }
          }
        ],
        "requestBody": {
          "content": {
            "application/json": {
              "schema": {
                "type": "string"
              }
            }
          },
          "required": true
        },
        "responses": {
          "200": {
            "description": "OK",
            "content": {
              "*/*": {
                "schema": {
                  "type": "string"
                }
              }
            }
          }
        }
      }
    },
    "/user": {
      "post": {
        "tags": [
          "user-controller"
        ],
        "operationId": "saveUser",
        "requestBody": {
          "content": {
            "application/json": {
              "schema": {
                "$ref": "#/components/schemas/User"
              }
            }
          },
          "required": true
        },
        "responses": {
          "200": {
            "description": "OK",
            "content": {
              "*/*": {
                "schema": {
                  "$ref": "#/components/schemas/User"
                }
              }
            }
          }
        }
      }
    },
    "/pay": {
      "post": {
        "tags": [
          "payment-controller"
        ],
        "operationId": "payMethod",
        "requestBody": {
          "content": {
            "application/json": {
              "schema": {
                "$ref": "#/components/schemas/PaymentRequest"
              }
            }
          },
          "required": true
        },
        "responses": {
          "200": {
            "description": "OK",
            "content": {
              "*/*": {
                "schema": {
                  "type": "string"
                }
              }
            }
          }
        }
      }
    },
    "/booking": {
      "post": {
        "tags": [
          "booking-controller"
        ],
        "operationId": "bookTicket",
        "requestBody": {
          "content": {
            "application/json": {
              "schema": {
                "$ref": "#/components/schemas/Booking"
              }
            }
          },
          "required": true
        },
        "responses": {
          "200": {
            "description": "OK",
            "content": {
              "*/*": {
                "schema": {
                  "type": "string"
                }
              }
            }
          }
        }
      }
    },
    "/addTheatre": {
      "post": {
        "tags": [
          "theatre-controller"
        ],
        "operationId": "addTheatre",
        "requestBody": {
          "content": {
            "application/json": {
              "schema": {
                "$ref": "#/components/schemas/Theatre"
              }
            }
          },
          "required": true
        },
        "responses": {
          "200": {
            "description": "OK",
            "content": {
              "*/*": {
                "schema": {
                  "type": "string"
                }
              }
            }
          }
        }
      }
    },
    "/addTheatre/{moviename}": {
      "post": {
        "tags": [
          "movie-controller"
        ],
        "operationId": "getMovies",
        "parameters": [
          {
            "name": "moviename",
            "in": "path",
            "required": true,
            "schema": {
              "type": "string"
            }
          }
        ],
        "requestBody": {
          "content": {
            "application/json": {
              "schema": {
                "type": "array",
                "items": {
                  "$ref": "#/components/schemas/Theatre"
                }
              }
            }
          },
          "required": true
        },
        "responses": {
          "200": {
            "description": "OK",
            "content": {
              "*/*": {
                "schema": {
                  "type": "string"
                }
              }
            }
          }
        }
      }
    },
    "/addShow": {
      "post": {
        "tags": [
          "show-controller"
        ],
        "operationId": "addShow",
        "requestBody": {
          "content": {
            "application/json": {
              "schema": {
                "$ref": "#/components/schemas/Show"
              }
            }
          },
          "required": true
        },
        "responses": {
          "200": {
            "description": "OK",
            "content": {
              "*/*": {
                "schema": {
                  "type": "string"
                }
              }
            }
          }
        }
      }
    },
    "/addSeat": {
      "post": {
        "tags": [
          "seat-controller"
        ],
        "operationId": "addSeat",
        "requestBody": {
          "content": {
            "application/json": {
              "schema": {
                "$ref": "#/components/schemas/Seat"
              }
            }
          },
          "required": true
        },
        "responses": {
          "200": {
            "description": "OK",
            "content": {
              "*/*": {
                "schema": {
                  "type": "string"
                }
              }
            }
          }
        }
      }
    },
    "/addScreen": {
      "post": {
        "tags": [
          "screen-controller"
        ],
        "operationId": "addScreen",
        "requestBody": {
          "content": {
            "application/json": {
              "schema": {
                "$ref": "#/components/schemas/Screen"
              }
            }
          },
          "required": true
        },
        "responses": {
          "200": {
            "description": "OK",
            "content": {
              "*/*": {
                "schema": {
                  "type": "string"
                }
              }
            }
          }
        }
      }
    },
    "/addMovies": {
      "post": {
        "tags": [
          "movie-controller"
        ],
        "operationId": "addMovies",
        "requestBody": {
          "content": {
            "application/json": {
              "schema": {
                "$ref": "#/components/schemas/Movie"
              }
            }
          },
          "required": true
        },
        "responses": {
          "200": {
            "description": "OK",
            "content": {
              "*/*": {
                "schema": {
                  "type": "string"
                }
              }
            }
          }
        }
      }
    },
    "/addCity": {
      "post": {
        "tags": [
          "city-controller"
        ],
        "operationId": "addCity",
        "requestBody": {
          "content": {
            "application/json": {
              "schema": {
                "$ref": "#/components/schemas/City"
              }
            }
          },
          "required": true
        },
        "responses": {
          "200": {
            "description": "OK",
            "content": {
              "*/*": {
                "schema": {
                  "type": "string"
                }
              }
            }
          }
        }
      }
    },
    "/users": {
      "get": {
        "tags": [
          "user-controller"
        ],
        "operationId": "getUsers",
        "responses": {
          "200": {
            "description": "OK",
            "content": {
              "*/*": {
                "schema": {
                  "type": "array",
                  "items": {
                    "$ref": "#/components/schemas/User"
                  }
                }
              }
            }
          }
        }
      }
    },
    "/health": {
      "get": {
        "tags": [
          "health-controller"
        ],
        "operationId": "healthCheck",
        "responses": {
          "200": {
            "description": "OK",
            "content": {
              "*/*": {
                "schema": {
                  "type": "string"
                }
              }
            }
          }
        }
      }
    },
    "/getMoviesWithTheatre/{moviename}": {
      "get": {
        "tags": [
          "movie-controller"
        ],
        "operationId": "getMovies_1",
        "parameters": [
          {
            "name": "moviename",
            "in": "path",
            "required": true,
            "schema": {
              "type": "string"
            }
          }
        ],
        "responses": {
          "200": {
            "description": "OK",
            "content": {
              "*/*": {
                "schema": {
                  "type": "string"
                }
              }
            }
          }
        }
      }
    },
    "/getMoviesForGivenTheatre/{theatreName}": {
      "get": {
        "tags": [
          "movie-controller"
        ],
        "operationId": "getMoviesForGivenTheatre",
        "parameters": [
          {
            "name": "theatreName",
            "in": "path",
            "required": true,
            "schema": {
              "type": "string"
            }
          }
        ],
        "responses": {
          "200": {
            "description": "OK",
            "content": {
              "*/*": {
                "schema": {
                  "type": "string"
                }
              }
            }
          }
        }
      }
    },
    "/getAllTheatres": {
      "get": {
        "tags": [
          "theatre-controller"
        ],
        "operationId": "getAllTheatres",
        "responses": {
          "200": {
            "description": "OK",
            "content": {
              "*/*": {
                "schema": {
                  "type": "string"
                }
              }
            }
          }
        }
      }
    },
    "/getAllTheatresByPincodeAndMovieName/{moviename}/{pincode}": {
      "get": {
        "tags": [
          "movie-controller"
        ],
        "operationId": "getMovies_2",
        "parameters": [
          {
            "name": "moviename",
            "in": "path",
            "required": true,
            "schema": {
              "type": "string"
            }
          },
          {
            "name": "pincode",
            "in": "path",
            "required": true,
            "schema": {
              "type": "integer",
              "format": "int64"
            }
          }
        ],
        "responses": {
          "200": {
            "description": "OK",
            "content": {
              "*/*": {
                "schema": {
                  "type": "string"
                }
              }
            }
          }
        }
      }
    }
  },
  "components": {
    "schemas": {
      "User": {
        "type": "object",
        "properties": {
          "id": {
            "type": "integer",
            "format": "int32"
          },
          "name": {
            "type": "string"
          },
          "email": {
            "type": "string"
          }
        }
      },
      "Booking": {
        "type": "object",
        "properties": {
          "id": {
            "type": "integer",
            "format": "int64"
          },
          "payment": {
            "$ref": "#/components/schemas/Payment"
          },
          "showSeat": {
            "$ref": "#/components/schemas/ShowSeat"
          }
        }
      },
      "Payment": {
        "type": "object",
        "properties": {
          "id": {
            "type": "integer",
            "format": "int64"
          },
          "amount": {
            "type": "number",
            "format": "double"
          },
          "paymentMode": {
            "type": "string",
            "enum": [
              "UPI",
              "CARD",
              "NETBANKING"
            ]
          }
        }
      },
      "PaymentRequest": {
        "type": "object",
        "properties": {
          "booking": {
            "$ref": "#/components/schemas/Booking"
          },
          "show": {
            "$ref": "#/components/schemas/Show"
          },
          "user": {
            "$ref": "#/components/schemas/User"
          },
          "numberOfTickets": {
            "type": "integer",
            "format": "int32"
          },
          "paymentMethod": {
            "type": "string"
          }
        }
      },
      "Seat": {
        "type": "object",
        "properties": {
          "id": {
            "type": "integer",
            "format": "int64"
          },
          "row": {
            "type": "integer",
            "format": "int32"
          },
          "seatcolumn": {
            "type": "string",
            "enum": [
              "A",
              "B",
              "C",
              "D",
              "E"
            ]
          },
          "seatCategory": {
            "type": "string",
            "enum": [
              "PLATINUM",
              "GOLD",
              "SILVER",
              "BRONZE"
            ]
          }
        }
      },
      "Show": {
        "type": "object",
        "properties": {
          "id": {
            "type": "integer",
            "format": "int64"
          },
          "showTime": {
            "type": "string",
            "format": "date-time"
          },
          "columns": {
            "type": "string",
            "enum": [
              "A",
              "B",
              "C",
              "D",
              "E"
            ]
          },
          "seats": {
            "type": "array",
            "items": {
              "$ref": "#/components/schemas/Seat"
            }
          }
        }
      },
      "ShowSeat": {
        "type": "object",
        "properties": {
          "id": {
            "type": "integer",
            "format": "int64"
          },
          "row": {
            "type": "integer",
            "format": "int32"
          },
          "seatcolumn": {
            "type": "string",
            "enum": [
              "A",
              "B",
              "C",
              "D",
              "E"
            ]
          },
          "seatCategory": {
            "type": "string",
            "enum": [
              "PLATINUM",
              "GOLD",
              "SILVER",
              "BRONZE"
            ]
          },
          "show": {
            "$ref": "#/components/schemas/Show"
          },
          "price": {
            "type": "number",
            "format": "double"
          },
          "bookStatus": {
            "type": "string",
            "enum": [
              "BOOKED",
              "AVAILABLE",
              "PENDING"
            ]
          }
        }
      },
      "City": {
        "type": "object",
        "properties": {
          "id": {
            "type": "integer",
            "format": "int32"
          },
          "name": {
            "type": "string"
          },
          "zipcode": {
            "type": "integer",
            "format": "int64"
          }
        }
      },
      "Screen": {
        "type": "object",
        "properties": {
          "id": {
            "type": "integer",
            "format": "int64"
          },
          "screenName": {
            "type": "string"
          },
          "shows": {
            "type": "array",
            "items": {
              "$ref": "#/components/schemas/Show"
            }
          }
        }
      },
      "Theatre": {
        "type": "object",
        "properties": {
          "id": {
            "type": "integer",
            "format": "int64"
          },
          "name": {
            "type": "string"
          },
          "city": {
            "$ref": "#/components/schemas/City"
          },
          "screens": {
            "type": "array",
            "items": {
              "$ref": "#/components/schemas/Screen"
            }
          }
        }
      },
      "Movie": {
        "type": "object",
        "properties": {
          "id": {
            "type": "integer",
            "format": "int64"
          },
          "movieName": {
            "type": "string"
          },
          "releaseDate": {
            "type": "string",
            "format": "date-time"
          },
          "summary": {
            "type": "string"
          },
          "genre": {
            "type": "string",
            "enum": [
              "ACTION",
              "ADVENTURE",
              "COMEDY",
              "CRIME",
              "DRAMA",
              "FANTASY",
              "HISTORICAL",
              "HORROR"
            ]
          },
          "theatres": {
            "type": "array",
            "items": {
              "$ref": "#/components/schemas/Theatre"
            }
          },
          "cities": {
            "type": "array",
            "items": {
              "$ref": "#/components/schemas/City"
            }
          }
        }
      }
    }
  }
}
```
# Ticketbooking

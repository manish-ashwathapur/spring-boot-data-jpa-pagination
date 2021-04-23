# spring-boot-data-jpa-pagination
This is Pagination using spring boot, spring data jpa and lombok

Expected out come : {
    "element1": [
        {
            "attr1": 1,
            "attr2": "ATTR2_VALUE1",
            "attr3": "2021-04-23T18:30:00.000+00:00"
        }
    ],
    "element2": [
        {
            "attr4": 4,
            "attr5": "ATTR5_VALUE1",
            "attr6": "2021-04-23T18:30:00.000+00:00",
            "attr7": 1
        },
        {
            "attr4": 5,
            "attr5": "ATTR5_VALUE2",
            "attr6": "2021-04-23T18:30:00.000+00:00",
            "attr7": 2
        }
    ],
    "element3": [
        {
            "attr8": 12,
            "attr9": 2
        }
    ]
}

As the data reduces in each element, those elements are eliminated and final output  will be {}.

Sample API - 
  When all elements are there - http://localhost:8080/data/0
  When no  elements are there - http://localhost:8080/data/5

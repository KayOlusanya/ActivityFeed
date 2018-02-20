/*Feed (id, alertType, category, description, issueStatus, timestamp, title, visitEngineer, visitTime)*/
insert into feed
values(1,'COMPLETE','VISIT', '<strong>Joel</strong> visited your property at <strong>11am</strong> and has marked your issue as <strong>resolved</strong>', 'resolved','2016-12-31 23:59:59','Your engineer visited today','Joel','11am' );
insert into feed
values(2,'INFO','VISIT', 'An engineer will visit your property on <strong>Tuesday 3rd July</strong> between <strong>8am - 1 pm</strong>. An engineer will call on the day to confirm a time slot', 'issue status','2016-12-31 23:59:59','Your engineer visit is booked','Tuesday 3rd July','8am - 1pm');
insert into feed
values(3,'ACTIONNEEDED','METERREAD', 'Looking at your recent energy usage we can see switching can save you money', 'It is time to read your meter','2017-12-31 23:59:59','It is time to read your meter','Tuesday 3rd July','8am - 1pm');
insert into feed
values(4,'INFO','TARIFF','Looking at your recent energy usage we can see switching can save you money','Save money by switching tariff','2018-12-31 23:59:59','Save money by switching tariff','Tuesday 3rd July','8am - 1pm');
drop table Customers
drop table Tenants
drop table Users
drop table Services
drop table TenantServices
drop table ServicesScenario


CREATE table Customers(
CustomerId bigint identity(1,1),
CustomerName nvarchar(200),
CustomerGUID nvarchar(100)
)


create table Tenants(
TenantId bigint identity(1,1),
TenantName nvarchar(200),
TenantGUID nvarchar(100),
CustomerId bigint
)

create table Users(
UserId bigint identity(1,1),
UserName nvarchar(200),
Pwd nvarchar(200),
Email nvarchar(100),
TenantId bigint,
ApprovalUserId bigint,
AdminUserId bigint,
)

create table ServiceProviders(
ServiceProvideId int identity(1,1),
ServiceProviderName nvarchar(200)
)

create table Services(
ServiceId bigint identity(1,1),
ServiceName nvarchar(500),
Active bit,
ServiceProviderId int
)

create table TenantServices(
TenantServicesId bigint identity(1,1),
TenantId bigint,
ServiceId bigint,
ServiceProvisionDate datetime
)

create table ServiceScenario(
ServiceScenarioId bigint identity(1,1),
ServiceScenarioName nvarchar(200),
ServiceScenarioDescription nvarchar(2000),
ServiceId bigint
)

create table ServiceRequestStatus(
StatusId bigint identity(1,1),
StatusName nvarchar(100)
)

drop table ServiceRequests
drop table ServiceRequestHistory

create table ScheduleTypes(
ScheduleTypeId int identity(1,1),
ScheduleType nvarchar(200)
)

create table ServiceRequests(
ServiceRequestId bigint identity(1,1),
ServiceId bigint,
ServiceScenarioId bigint,
UserId bigint,
RequestData nvarchar(max),
RequestDate datetime default(getutcdate()),
RequestExpiry datetime default(dateadd(month,1,getutcdate())),
StatusId Int,
ScheduleType int,
ScheduleDateTime datetime,
SchedulePriority int
)

create table ServiceRequestHistory(
ServiceRequestHistoryId bigint identity(1,1),
ServiceRequestId bigint,
ServiceId bigint,
ServiceScenarioId bigint,
UserId bigint,
RequestData nvarchar(max),
RequestDate datetime default(getutcdate()),
RequestExpiry datetime default(dateadd(month,1,getutcdate())),
StatusId Int,
ScheduleType int,
ScheduleDateTime datetime,
SchedulePriority int,
RequestHistoryDate datetime
)


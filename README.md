Overview

Customer Management System is a Spring Boot application designed to manage communities, discussions, replies, and users.
It includes RESTful APIs for creating and managing these entities. The application uses a MySQL database and JPA for persistence.

Features

Community Management: Create and manage communities, set moderators, and allow users to join communities.
Discussion Management: Create and manage discussions within communities.
Reply Management: Add replies to discussions.
User Management: Create and manage user accounts.

Project Structure

Controllers: Handle HTTP requests and map them to services.
CommunityController: Manages community-related operations.
DiscussionController: Manages discussion-related operations.
ReplyController: Manages reply-related operations.
UserController: Manages user-related operations.

Models: Define the structure of the application's data.
Community: Represents a community.
Discussion: Represents a discussion in a community.
Reply: Represents a reply to a discussion.
User: Represents a user.

Repositories: Provide CRUD operations for models using JPA.
CommunityRepository
DiscussionRepository
ReplyRepository
UserRepository

Services: Contain business logic and interact with repositories.
CommunityService
DiscussionService
ReplyService
UserService
Configuration: Application properties configuration for database connection.


Endpoints

CommunityController
POST /addNewCommunity: Add a new community.
POST /setModerators/{communityId}/{userId}: Set a user as a moderator of a community.
POST /joinCommunity/{communityId}/{userId}: Add a user to a community.
GET /getCommunity/{id}: Get a community by ID.
GET /getAll: Get all communities.
DiscussionController
POST /setDiscussions: Add a new discussion.
ReplyController
POST /reply: Add a reply to a discussion.
UserController
POST /addNewUser: Add a new user.

Dependencies
Spring Boot
Spring Data JPA
Hibernate
MySQL Driver
Lombok
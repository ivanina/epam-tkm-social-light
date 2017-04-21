CREATE TABLE facebook_user (
  id            BIGSERIAL PRIMARY KEY,
  fb_id         BIGINT NOT NULL,
  first_name    VARCHAR(50),
  last_name     VARCHAR(50),
  keywords      JSON,
  fb_data       JSON,
  date_added    TIMESTAMP DEFAULT now() NOT NULL  ,
  date_modified TIMESTAMP DEFAULT NULL
);

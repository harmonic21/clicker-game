--liquibase formatted sql

--changeset harmonic:CG-2-create-schema
create schema if not exists clicker_core
--rollback drop schema if exists clicker_core;
/*
 * This file is generated by jOOQ.
 */
package com.sonicle.webtop.drm.jooq;



/**
 * A class modelling indexes of tables in drm.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Indexes {

    // -------------------------------------------------------------------------
    // INDEX definitions
    // -------------------------------------------------------------------------

    public static final org.jooq.Index ACTIVITIES_AK1 = org.jooq.impl.Internal.createIndex(org.jooq.impl.DSL.name("activities_ak1"), com.sonicle.webtop.drm.jooq.tables.Activities.ACTIVITIES, new org.jooq.OrderField[] { com.sonicle.webtop.drm.jooq.tables.Activities.ACTIVITIES.ACTIVITY_ID, com.sonicle.webtop.drm.jooq.tables.Activities.ACTIVITIES.DOMAIN_ID }, false);
    public static final org.jooq.Index ACTIVITIES_AK2 = org.jooq.impl.Internal.createIndex(org.jooq.impl.DSL.name("activities_ak2"), com.sonicle.webtop.drm.jooq.tables.Activities.ACTIVITIES, new org.jooq.OrderField[] { com.sonicle.webtop.drm.jooq.tables.Activities.ACTIVITIES.EXTERNAL_ID, com.sonicle.webtop.drm.jooq.tables.Activities.ACTIVITIES.DOMAIN_ID }, false);
    public static final org.jooq.Index ACTIVITIES_GROUPS_AK1 = org.jooq.impl.Internal.createIndex(org.jooq.impl.DSL.name("activities_groups_ak1"), com.sonicle.webtop.drm.jooq.tables.ActivitiesGroups.ACTIVITIES_GROUPS, new org.jooq.OrderField[] { com.sonicle.webtop.drm.jooq.tables.ActivitiesGroups.ACTIVITIES_GROUPS.ACTIVITY_ID, com.sonicle.webtop.drm.jooq.tables.ActivitiesGroups.ACTIVITIES_GROUPS.GROUP_ID }, true);
    public static final org.jooq.Index COMPANIES_USERS_AK1 = org.jooq.impl.Internal.createIndex(org.jooq.impl.DSL.name("companies_users_ak1"), com.sonicle.webtop.drm.jooq.tables.CompaniesUsers.COMPANIES_USERS, new org.jooq.OrderField[] { com.sonicle.webtop.drm.jooq.tables.CompaniesUsers.COMPANIES_USERS.COMPANY_ID, com.sonicle.webtop.drm.jooq.tables.CompaniesUsers.COMPANIES_USERS.USER_ID }, true);
    public static final org.jooq.Index DOC_STATUSES_GROUPS_AK1 = org.jooq.impl.Internal.createIndex(org.jooq.impl.DSL.name("doc_statuses_groups_ak1"), com.sonicle.webtop.drm.jooq.tables.DocStatusesGroups.DOC_STATUSES_GROUPS, new org.jooq.OrderField[] { com.sonicle.webtop.drm.jooq.tables.DocStatusesGroups.DOC_STATUSES_GROUPS.DOC_STATUS_ID, com.sonicle.webtop.drm.jooq.tables.DocStatusesGroups.DOC_STATUSES_GROUPS.GROUP_ID }, true);
    public static final org.jooq.Index GROUPS_AK1 = org.jooq.impl.Internal.createIndex(org.jooq.impl.DSL.name("groups_ak1"), com.sonicle.webtop.drm.jooq.tables.Groups.GROUPS, new org.jooq.OrderField[] { com.sonicle.webtop.drm.jooq.tables.Groups.GROUPS.DOMAIN_ID, com.sonicle.webtop.drm.jooq.tables.Groups.GROUPS.GROUP_CATEGORY }, false);
    public static final org.jooq.Index TICKET_CATEGORIES_AK1 = org.jooq.impl.Internal.createIndex(org.jooq.impl.DSL.name("ticket_categories_ak1"), com.sonicle.webtop.drm.jooq.tables.TicketCategories.TICKET_CATEGORIES, new org.jooq.OrderField[] { com.sonicle.webtop.drm.jooq.tables.TicketCategories.TICKET_CATEGORIES.TICKET_CATEGORY_ID, com.sonicle.webtop.drm.jooq.tables.TicketCategories.TICKET_CATEGORIES.DOMAIN_ID }, false);
    public static final org.jooq.Index TICKET_CATEGORIES_AK2 = org.jooq.impl.Internal.createIndex(org.jooq.impl.DSL.name("ticket_categories_ak2"), com.sonicle.webtop.drm.jooq.tables.TicketCategories.TICKET_CATEGORIES, new org.jooq.OrderField[] { com.sonicle.webtop.drm.jooq.tables.TicketCategories.TICKET_CATEGORIES.EXTERNAL_ID, com.sonicle.webtop.drm.jooq.tables.TicketCategories.TICKET_CATEGORIES.DOMAIN_ID }, false);
    public static final org.jooq.Index TTRT_AK1 = org.jooq.impl.Internal.createIndex(org.jooq.impl.DSL.name("ttrt_ak1"), com.sonicle.webtop.drm.jooq.tables.TimetableReportTemp.TIMETABLE_REPORT_TEMP, new org.jooq.OrderField[] { com.sonicle.webtop.drm.jooq.tables.TimetableReportTemp.TIMETABLE_REPORT_TEMP.DOMAIN_ID, com.sonicle.webtop.drm.jooq.tables.TimetableReportTemp.TIMETABLE_REPORT_TEMP.USER_ID, com.sonicle.webtop.drm.jooq.tables.TimetableReportTemp.TIMETABLE_REPORT_TEMP.DATE }, false);
    public static final org.jooq.Index WORK_TYPES_AK1 = org.jooq.impl.Internal.createIndex(org.jooq.impl.DSL.name("work_types_ak1"), com.sonicle.webtop.drm.jooq.tables.WorkTypes.WORK_TYPES, new org.jooq.OrderField[] { com.sonicle.webtop.drm.jooq.tables.WorkTypes.WORK_TYPES.WORK_TYPE_ID, com.sonicle.webtop.drm.jooq.tables.WorkTypes.WORK_TYPES.DOMAIN_ID }, false);
}

package com.bytedance.ies.xbridge.model.params;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.AbstractC18754n;
import com.bytedance.ies.xbridge.C18586i;
import com.bytedance.ies.xbridge.model.params.AbstractC18749a;
import p4600h.p4601a.C89064i;
import p4600h.p4611f.p4613b.C89219l;

public final class XSetCalendarEventMethodParamModel extends AbstractC18749a {
    public static final C18747a Companion = new C18747a((byte) 0);
    private final String action;
    private Long alarmOffsets;
    private Boolean allDay;
    private Long endDate = 0L;
    private String eventID;
    private String location;
    private String notes;
    private Long startDate = 0L;
    private String title;
    private String url;

    static {
        Covode.recordClassIndex(21441);
    }

    /* renamed from: com.bytedance.ies.xbridge.model.params.XSetCalendarEventMethodParamModel$a */
    public static final class C18747a {
        static {
            Covode.recordClassIndex(21442);
        }

        private C18747a() {
        }

        public /* synthetic */ C18747a(byte b) {
            this();
        }
    }

    public final String getAction() {
        return this.action;
    }

    public final Long getAlarmOffsets() {
        return this.alarmOffsets;
    }

    public final Boolean getAllDay() {
        return this.allDay;
    }

    public final Long getEndDate() {
        return this.endDate;
    }

    public final String getEventID() {
        return this.eventID;
    }

    public final String getLocation() {
        return this.location;
    }

    public final String getNotes() {
        return this.notes;
    }

    public final Long getStartDate() {
        return this.startDate;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUrl() {
        return this.url;
    }

    public final String toString() {
        String canonicalName = getClass().getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "XCalendarMethodParamModel";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(canonicalName + '(');
        sb.append("action = " + this.action + " ,");
        sb.append("eventID = " + this.eventID + " , ");
        sb.append("startDate = " + this.startDate + " , ");
        sb.append("endDate = " + this.endDate + " , ");
        sb.append("alarmOffsets = [ " + this.alarmOffsets + ' ');
        sb.append("], ");
        sb.append("allDay = " + this.allDay + " , ");
        sb.append("title = " + this.title + " , ");
        sb.append("notes = " + this.notes + " , ");
        sb.append("location = " + this.location + " , ");
        sb.append("url = " + this.url + ')');
        String sb2 = sb.toString();
        C89219l.m154709a((Object) sb2, "");
        return sb2;
    }

    public final void setAlarmOffsets(Long l) {
        this.alarmOffsets = l;
    }

    public final void setAllDay(Boolean bool) {
        this.allDay = bool;
    }

    public final void setEndDate(Long l) {
        this.endDate = l;
    }

    public final void setEventID(String str) {
        this.eventID = str;
    }

    public final void setLocation(String str) {
        this.location = str;
    }

    public final void setNotes(String str) {
        this.notes = str;
    }

    public final void setStartDate(Long l) {
        this.startDate = l;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final void setUrl(String str) {
        this.url = str;
    }

    public XSetCalendarEventMethodParamModel(String str) {
        C89219l.m154719c(str, "");
        this.action = str;
    }

    public static final XSetCalendarEventMethodParamModel convert(AbstractC18754n nVar) {
        String str;
        C89219l.m154719c(nVar, "");
        String str2 = C18586i.m34539a(nVar, "eventID", "");
        if (C89219l.m154714a((Object) str2, (Object) "")) {
            str = "create";
        } else {
            str = "update";
        }
        Long a = AbstractC18749a.C18750a.m34817a(nVar, "startDate");
        Long a2 = AbstractC18749a.C18750a.m34817a(nVar, "endDate");
        String str3 = C18586i.m34539a(nVar, "location", "");
        String str4 = C18586i.m34539a(nVar, "url", "");
        String str5 = C18586i.m34539a(nVar, "title", "");
        String str6 = C18586i.m34539a(nVar, "notes", "");
        boolean a3 = C18586i.m34542a(nVar, "allDay", false);
        Long valueOf = Long.valueOf((long) AbstractC18749a.C18750a.m34816a(nVar, "alarmOffset", 0));
        XSetCalendarEventMethodParamModel xSetCalendarEventMethodParamModel = new XSetCalendarEventMethodParamModel(str);
        xSetCalendarEventMethodParamModel.setStartDate(a);
        xSetCalendarEventMethodParamModel.setEndDate(a2);
        xSetCalendarEventMethodParamModel.setTitle(str5);
        xSetCalendarEventMethodParamModel.setEventID(str2);
        xSetCalendarEventMethodParamModel.setNotes(str6);
        xSetCalendarEventMethodParamModel.setAlarmOffsets(valueOf);
        xSetCalendarEventMethodParamModel.setLocation(str3);
        xSetCalendarEventMethodParamModel.setUrl(str4);
        xSetCalendarEventMethodParamModel.setAllDay(Boolean.valueOf(a3));
        String action2 = xSetCalendarEventMethodParamModel.getAction();
        if (action2 == null || action2.length() == 0 || !C89064i.m154489a(new String[]{"create", "delete", "update", "read"}, xSetCalendarEventMethodParamModel.getAction())) {
            return null;
        }
        if (C89219l.m154714a((Object) xSetCalendarEventMethodParamModel.getAction(), (Object) "create") || C89219l.m154714a((Object) xSetCalendarEventMethodParamModel.getAction(), (Object) "update")) {
            if ((C89219l.m154714a((Object) xSetCalendarEventMethodParamModel.getAction(), (Object) "update") && xSetCalendarEventMethodParamModel.getEventID() == null) || xSetCalendarEventMethodParamModel.getStartDate() == null || xSetCalendarEventMethodParamModel.getEndDate() == null) {
                return null;
            }
            Long endDate2 = xSetCalendarEventMethodParamModel.getEndDate();
            if (endDate2 == null) {
                C89219l.m154707a();
            }
            long longValue = endDate2.longValue();
            Long startDate2 = xSetCalendarEventMethodParamModel.getStartDate();
            if (startDate2 == null) {
                C89219l.m154707a();
            }
            if (longValue < startDate2.longValue()) {
                return null;
            }
            Long endDate3 = xSetCalendarEventMethodParamModel.getEndDate();
            if (endDate3 == null) {
                C89219l.m154707a();
            }
            if (endDate3.longValue() < 0) {
                return null;
            }
            Long startDate3 = xSetCalendarEventMethodParamModel.getStartDate();
            if (startDate3 == null) {
                C89219l.m154707a();
            }
            if (startDate3.longValue() < 0 || xSetCalendarEventMethodParamModel.getAlarmOffsets() == null) {
                return null;
            }
            Long alarmOffsets2 = xSetCalendarEventMethodParamModel.getAlarmOffsets();
            if (alarmOffsets2 == null) {
                C89219l.m154707a();
            }
            if (alarmOffsets2.longValue() < 0 || xSetCalendarEventMethodParamModel.getAllDay() == null || xSetCalendarEventMethodParamModel.getTitle() == null || xSetCalendarEventMethodParamModel.getNotes() == null || xSetCalendarEventMethodParamModel.getLocation() == null || xSetCalendarEventMethodParamModel.getAllDay() == null || xSetCalendarEventMethodParamModel.getUrl() == null) {
                return null;
            }
            return xSetCalendarEventMethodParamModel;
        } else if ((C89219l.m154714a((Object) xSetCalendarEventMethodParamModel.getAction(), (Object) "delete") || C89219l.m154714a((Object) xSetCalendarEventMethodParamModel.getAction(), (Object) "read")) && xSetCalendarEventMethodParamModel.getEventID() == null) {
            return null;
        }
        return xSetCalendarEventMethodParamModel;
    }
}

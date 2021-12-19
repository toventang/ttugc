package com.bytedance.ies.xbridge.system.p1361c;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.model.params.AbstractC18749a;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xbridge.system.c.g */
public final class C18906g extends AbstractC18749a {

    /* renamed from: j */
    public static final C18907a f44744j = new C18907a((byte) 0);

    /* renamed from: a */
    public long f44745a;

    /* renamed from: b */
    public long f44746b;

    /* renamed from: c */
    public String f44747c;

    /* renamed from: d */
    public String f44748d;

    /* renamed from: e */
    public String f44749e;

    /* renamed from: f */
    public Long f44750f;

    /* renamed from: g */
    public Boolean f44751g;

    /* renamed from: h */
    public String f44752h;

    /* renamed from: i */
    public String f44753i;

    static {
        Covode.recordClassIndex(21616);
    }

    /* renamed from: com.bytedance.ies.xbridge.system.c.g$a */
    public static final class C18907a {
        static {
            Covode.recordClassIndex(21617);
        }

        private C18907a() {
        }

        public /* synthetic */ C18907a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.ies.xbridge.model.params.AbstractC18749a
    public final List<String> provideParamList() {
        return C89070n.m154522b("endDate", "startDate", "eventID", "title", "notes", "alarmOffsets", "allDay", "location", "url");
    }

    public final String toString() {
        String canonicalName = getClass().getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "XCalendarMethodParamModel";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(canonicalName + '(');
        sb.append("eventID = " + this.f44747c + " , ");
        sb.append("startDate = " + this.f44746b + " , ");
        sb.append("endDate = " + this.f44745a + " , ");
        sb.append("alarmOffsets = [ " + this.f44750f + ' ');
        sb.append("], ");
        sb.append("allDay = " + this.f44751g + " , ");
        sb.append("title = " + this.f44748d + " , ");
        sb.append("notes = " + this.f44749e + " , ");
        sb.append("location = " + this.f44752h + " , ");
        sb.append("url = " + this.f44753i + ')');
        String sb2 = sb.toString();
        C89219l.m154709a((Object) sb2, "");
        return sb2;
    }
}

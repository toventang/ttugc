package com.bytedance.ies.web.jsbridge2;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.web.jsbridge2.AbstractC18347m;
import com.bytedance.ies.web.jsbridge2.C18309ac;
import com.bytedance.ies.web.jsbridge2.C18315ad;
import com.bytedance.ies.web.jsbridge2.TimeLineEvent;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.bytedance.ies.web.jsbridge2.ab */
public final class C18308ab {

    /* renamed from: a */
    public final Set<String> f43785a;

    /* renamed from: b */
    final C18315ad f43786b = C18364w.f43928a;

    /* renamed from: c */
    public AbstractC18347m.AbstractC18351c f43787c;

    /* renamed from: d */
    public AbstractC18347m.AbstractC18352d f43788d;

    /* renamed from: e */
    private final Set<String> f43789e;

    /* renamed from: f */
    private final C18309ac f43790f;

    static {
        Covode.recordClassIndex(20980);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo29307a(C18315ad.AbstractC18319a aVar) {
        C18315ad adVar = this.f43786b;
        if (adVar != null) {
            adVar.mo29320a(aVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo29309b(Collection<String> collection) {
        this.f43789e.addAll(collection);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo29308a(Collection<String> collection) {
        this.f43785a.addAll(collection);
    }

    C18308ab(C18309ac acVar, Set<String> set, Set<String> set2) {
        this.f43790f = acVar;
        this.f43785a = new LinkedHashSet(set);
        this.f43789e = new LinkedHashSet(set2);
    }

    /* renamed from: a */
    private synchronized EnumC18323ah m34044a(String str, AbstractC18332c cVar, List<TimeLineEvent> list) {
        MethodCollector.m26663i(6117);
        if (this.f43790f == null) {
            new TimeLineEvent.C18302a().mo29301a(TimeLineEvent.C18303b.f43777z, TimeLineEvent.C18303b.f43759h).mo29301a(TimeLineEvent.C18303b.f43762k, TimeLineEvent.C18303b.f43759h).mo29302a(TimeLineEvent.C18303b.f43715aD, list);
            MethodCollector.m26664o(6117);
            return null;
        }
        C18315ad adVar = this.f43786b;
        if (adVar == null || adVar.f43813f) {
            C18309ac acVar = this.f43790f;
            Uri parse = Uri.parse(str);
            String scheme = parse.getScheme();
            String authority = parse.getAuthority();
            String builder = new Uri.Builder().scheme(scheme).authority(authority).path(parse.getPath()).toString();
            C18309ac.C18314c cVar2 = new C18309ac.C18314c();
            if (authority == null || authority.isEmpty()) {
                new TimeLineEvent.C18302a().mo29301a(TimeLineEvent.C18303b.f43767p, TimeLineEvent.C18303b.f43759h).mo29302a(TimeLineEvent.C18303b.f43752az, list);
                cVar2.f43805a = EnumC18323ah.PUBLIC;
            } else {
                cVar2 = acVar.f43792b.get(builder);
                if (cVar2 != null) {
                    new TimeLineEvent.C18302a().mo29301a(TimeLineEvent.C18303b.f43758g, TimeLineEvent.C18303b.f43695K).mo29301a(TimeLineEvent.C18303b.f43685A, cVar2.f43805a.toString()).mo29301a(TimeLineEvent.C18303b.f43686B, cVar2.f43806b.toString()).mo29301a(TimeLineEvent.C18303b.f43687C, cVar2.f43807c.toString()).mo29302a(TimeLineEvent.C18303b.f43716aE, list);
                } else {
                    cVar2 = acVar.mo29310a(builder, list);
                    new TimeLineEvent.C18302a().mo29301a(TimeLineEvent.C18303b.f43758g, TimeLineEvent.C18303b.f43696L).mo29302a(TimeLineEvent.C18303b.f43750ax, list);
                }
            }
            if (cVar2.f43807c.contains(cVar.getName())) {
                MethodCollector.m26664o(6117);
                return null;
            } else if (cVar2.f43806b.contains(cVar.getName())) {
                EnumC18323ah ahVar = EnumC18323ah.PRIVATE;
                MethodCollector.m26664o(6117);
                return ahVar;
            } else if (cVar2.f43805a.compareTo((Enum) cVar.getPermissionGroup()) < 0) {
                MethodCollector.m26664o(6117);
                return null;
            } else {
                EnumC18323ah ahVar2 = cVar2.f43805a;
                MethodCollector.m26664o(6117);
                return ahVar2;
            }
        } else {
            new TimeLineEvent.C18302a().mo29301a(TimeLineEvent.C18303b.f43763l, TimeLineEvent.C18303b.f43760i).mo29302a(TimeLineEvent.C18303b.f43720aI, list);
            C18309ac.C18312a aVar = new C18309ac.C18312a("Permission configuration has not been fetched");
            MethodCollector.m26664o(6117);
            throw aVar;
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01a9, code lost:
        if (r6 != false) goto L_0x01ab;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01b1  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01bd  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01cc  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.bytedance.ies.web.jsbridge2.EnumC18323ah mo29306a(boolean r10, java.lang.String r11, com.bytedance.ies.web.jsbridge2.AbstractC18332c r12, java.util.List<com.bytedance.ies.web.jsbridge2.TimeLineEvent> r13) {
        /*
        // Method dump skipped, instructions count: 470
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.web.jsbridge2.C18308ab.mo29306a(boolean, java.lang.String, com.bytedance.ies.web.jsbridge2.c, java.util.List):com.bytedance.ies.web.jsbridge2.ah");
    }
}

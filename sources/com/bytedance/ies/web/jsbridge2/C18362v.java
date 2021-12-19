package com.bytedance.ies.web.jsbridge2;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.jsbridge2.TimeLineEvent;
import com.kakao.usermgmt.StringSet;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.bytedance.ies.web.jsbridge2.v */
public class C18362v {

    /* renamed from: a */
    public final int f43912a;

    /* renamed from: b */
    public final String f43913b;

    /* renamed from: c */
    public final String f43914c;

    /* renamed from: d */
    public final String f43915d;

    /* renamed from: e */
    public final String f43916e;

    /* renamed from: f */
    public final String f43917f;

    /* renamed from: g */
    public final String f43918g;

    /* renamed from: h */
    public final String f43919h;

    /* renamed from: i */
    public final List<TimeLineEvent> f43920i;

    static {
        Covode.recordClassIndex(21034);
    }

    /* renamed from: com.bytedance.ies.web.jsbridge2.v$a */
    public static final class C18363a {

        /* renamed from: a */
        public String f43921a;

        /* renamed from: b */
        public String f43922b;

        /* renamed from: c */
        public String f43923c;

        /* renamed from: d */
        public String f43924d;

        /* renamed from: e */
        public String f43925e;

        /* renamed from: f */
        public String f43926f;

        /* renamed from: g */
        public String f43927g;

        static {
            Covode.recordClassIndex(21035);
        }

        private C18363a() {
        }

        /* renamed from: a */
        public final C18362v mo29399a() {
            return new C18362v(this, (byte) 0);
        }

        /* synthetic */ C18363a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public static C18363a m34176a() {
        return new C18363a((byte) 0);
    }

    public String toString() {
        String str;
        StringBuilder append = new StringBuilder("methodName: ").append(this.f43915d).append(", params: ").append(this.f43916e).append(", callbackId: ").append(this.f43917f).append(", type: ").append(this.f43914c).append(", iFrameUrl: ");
        if (TextUtils.isEmpty(this.f43919h)) {
            str = TimeLineEvent.C18303b.f43759h;
        } else {
            str = this.f43919h;
        }
        return append.append(str).append(", version: ").append(this.f43913b).append(", ").toString();
    }

    /* renamed from: a */
    public static boolean m34177a(C18362v vVar) {
        if (vVar == null || vVar.f43912a != 1 || TextUtils.isEmpty(vVar.f43915d) || TextUtils.isEmpty(vVar.f43916e)) {
            return true;
        }
        return false;
    }

    C18362v(String str) {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.f43920i = copyOnWriteArrayList;
        this.f43913b = null;
        this.f43914c = null;
        this.f43915d = null;
        this.f43916e = null;
        this.f43917f = str;
        this.f43918g = null;
        this.f43912a = -5;
        this.f43919h = null;
        new TimeLineEvent.C18302a().mo29301a("callbackId", str).mo29301a("code", (Object) -5).mo29302a(TimeLineEvent.C18303b.f43744ar, (List<TimeLineEvent>) copyOnWriteArrayList);
    }

    private C18362v(C18363a aVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.f43920i = copyOnWriteArrayList;
        String str = aVar.f43921a;
        this.f43913b = str;
        String str2 = aVar.f43922b;
        this.f43914c = str2;
        String str3 = aVar.f43923c;
        this.f43915d = str3;
        String str4 = aVar.f43924d;
        this.f43916e = str4;
        String str5 = aVar.f43925e;
        this.f43917f = str5;
        String str6 = aVar.f43926f;
        this.f43918g = str6;
        this.f43912a = 1;
        String str7 = aVar.f43927g;
        this.f43919h = str7;
        new TimeLineEvent.C18302a().mo29301a("version", str).mo29301a(StringSet.type, str2).mo29301a("methodName", str3).mo29301a("params", str4).mo29301a("namespace", str6).mo29301a("callbackId", str5).mo29301a("namespace", str6).mo29301a("iFrameUrl", str7).mo29302a(TimeLineEvent.C18303b.f43744ar, (List<TimeLineEvent>) copyOnWriteArrayList);
    }

    /* synthetic */ C18362v(C18363a aVar, byte b) {
        this(aVar);
    }
}

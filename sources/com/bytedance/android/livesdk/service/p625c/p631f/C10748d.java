package com.bytedance.android.livesdk.service.p625c.p631f;

import android.text.TextUtils;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p425aa.C6555i;
import com.bytedance.android.livesdk.service.p625c.p631f.C10743a;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.service.c.f.d */
public final class C10748d {

    /* renamed from: a */
    public static final C10748d f25892a = new C10748d();

    /* renamed from: com.bytedance.android.livesdk.service.c.f.d$a */
    public enum EnumC10749a {
        ANCHOR,
        GUEST;

        static {
            Covode.recordClassIndex(12346);
        }
    }

    private C10748d() {
    }

    static {
        Covode.recordClassIndex(12345);
    }

    /* renamed from: a */
    public static final void m19338a(EnumC10749a aVar) {
        String str;
        C89219l.m154721d(aVar, "");
        if (aVar == EnumC10749a.ANCHOR) {
            str = "host_unable_receive";
        } else {
            str = "guest_unable_receive";
        }
        C6501b.C6502a.m13948a("livesdk_guest_connection_unable_gift_toast").mo12639a().mo12651a("reason", str).mo12655b();
    }

    /* renamed from: a */
    public static final void m19337a(int i) {
        HashMap hashMap = new HashMap();
        if (i == 0) {
            hashMap.put("click_icon", "continue");
            C6501b.C6502a.m13948a("livesdk_gift_age_popup_click").mo12652a((Map<String, String>) hashMap).mo12639a().mo12656c("click").mo12654b("live").mo12658d("gift_dialog").mo12655b();
        } else if (i != 1) {
            C6501b.C6502a.m13948a("livesdk_gift_age_popup_show").mo12639a().mo12656c("show").mo12654b("live").mo12658d("gift_dialog").mo12655b();
        } else {
            hashMap.put("click_icon", "cancel");
            C6501b.C6502a.m13948a("livesdk_gift_age_popup_click").mo12652a((Map<String, String>) hashMap).mo12639a().mo12656c("click").mo12654b("live").mo12658d("gift_dialog").mo12655b();
        }
    }

    /* renamed from: a */
    public static final void m19339a(String str) {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("desc", str);
        }
        if (!TextUtils.isEmpty(null)) {
            hashMap.put("gift_id", null);
        }
        if (!TextUtils.isEmpty(null)) {
            hashMap.put("msg_id", null);
        }
        C6555i.m14021b().mo9215a("ttlive_gift", hashMap);
    }

    /* renamed from: com.bytedance.android.livesdk.service.c.f.d$b */
    public static final class C10750b implements C10743a.AbstractC10744a {

        /* renamed from: a */
        final /* synthetic */ int f25894a;

        /* renamed from: b */
        final /* synthetic */ long f25895b;

        /* renamed from: c */
        final /* synthetic */ boolean f25896c;

        /* renamed from: d */
        final /* synthetic */ String f25897d;

        /* renamed from: e */
        final /* synthetic */ String f25898e;

        /* renamed from: f */
        final /* synthetic */ int f25899f;

        /* renamed from: g */
        final /* synthetic */ String f25900g;

        /* renamed from: h */
        final /* synthetic */ String f25901h;

        /* renamed from: i */
        final /* synthetic */ String f25902i;

        /* renamed from: j */
        final /* synthetic */ boolean f25903j;

        /* renamed from: k */
        final /* synthetic */ int f25904k;

        /* renamed from: l */
        final /* synthetic */ long f25905l;

        static {
            Covode.recordClassIndex(12347);
        }

        public C10750b(int i, long j, boolean z, String str, String str2, int i2, String str3, String str4, String str5, boolean z2, int i3, long j2) {
            this.f25894a = i;
            this.f25895b = j;
            this.f25896c = z;
            this.f25897d = str;
            this.f25898e = str2;
            this.f25899f = i2;
            this.f25900g = str3;
            this.f25901h = str4;
            this.f25902i = str5;
            this.f25903j = z2;
            this.f25904k = i3;
            this.f25905l = j2;
        }

        /* JADX WARNING: Removed duplicated region for block: B:104:0x02b4  */
        /* JADX WARNING: Removed duplicated region for block: B:107:0x02c6  */
        /* JADX WARNING: Removed duplicated region for block: B:116:0x0305  */
        /* JADX WARNING: Removed duplicated region for block: B:119:0x030c  */
        /* JADX WARNING: Removed duplicated region for block: B:120:0x030f  */
        /* JADX WARNING: Removed duplicated region for block: B:121:0x0313  */
        /* JADX WARNING: Removed duplicated region for block: B:80:0x01f2  */
        /* JADX WARNING: Removed duplicated region for block: B:85:0x024a  */
        /* JADX WARNING: Removed duplicated region for block: B:90:0x026b  */
        /* JADX WARNING: Removed duplicated region for block: B:93:0x0272  */
        @Override // com.bytedance.android.livesdk.service.p625c.p631f.C10743a.AbstractC10744a
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo17666a(java.lang.String r30, int r31, java.lang.String r32) {
            /*
            // Method dump skipped, instructions count: 913
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.service.p625c.p631f.C10748d.C10750b.mo17666a(java.lang.String, int, java.lang.String):void");
        }
    }
}

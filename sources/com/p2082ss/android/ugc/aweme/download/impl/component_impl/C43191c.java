package com.p2082ss.android.ugc.aweme.download.impl.component_impl;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.socialbase.p2177a.AbstractC30281b;
import com.p2082ss.android.ugc.aweme.download.component_api.depend.IDownloadSdkMonitorDepend;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.download.impl.component_impl.c */
public final class C43191c {

    /* renamed from: a */
    public static final C43191c f100679a = new C43191c();

    private C43191c() {
    }

    /* renamed from: com.ss.android.ugc.aweme.download.impl.component_impl.c$a */
    public static final class C43192a implements AbstractC30281b {

        /* renamed from: a */
        final /* synthetic */ IDownloadSdkMonitorDepend f100680a;

        static {
            Covode.recordClassIndex(51379);
        }

        @Override // com.p2082ss.android.socialbase.p2177a.AbstractC30281b
        /* renamed from: e */
        public final long mo53739e() {
            return this.f100680a.getUpdateVersionCode();
        }

        @Override // com.p2082ss.android.socialbase.p2177a.AbstractC30281b
        /* renamed from: h */
        public final String[] mo53742h() {
            return this.f100680a.getMonitorHosts();
        }

        @Override // com.p2082ss.android.socialbase.p2177a.AbstractC30281b
        /* renamed from: a */
        public final Context mo53735a() {
            Context context = this.f100680a.getContext();
            if (context == null) {
                C89219l.m154715b();
            }
            return context;
        }

        @Override // com.p2082ss.android.socialbase.p2177a.AbstractC30281b
        /* renamed from: b */
        public final String mo53736b() {
            String aid = this.f100680a.getAid();
            if (aid == null) {
                return "";
            }
            return aid;
        }

        @Override // com.p2082ss.android.socialbase.p2177a.AbstractC30281b
        /* renamed from: c */
        public final String mo53737c() {
            String deviceId = this.f100680a.getDeviceId();
            if (deviceId == null) {
                return "";
            }
            return deviceId;
        }

        @Override // com.p2082ss.android.socialbase.p2177a.AbstractC30281b
        /* renamed from: d */
        public final String mo53738d() {
            String channel = this.f100680a.getChannel();
            if (channel == null) {
                return "";
            }
            return channel;
        }

        @Override // com.p2082ss.android.socialbase.p2177a.AbstractC30281b
        /* renamed from: f */
        public final String mo53740f() {
            String appVersionName = this.f100680a.getAppVersionName();
            if (appVersionName == null) {
                return "";
            }
            return appVersionName;
        }

        @Override // com.p2082ss.android.socialbase.p2177a.AbstractC30281b
        /* renamed from: g */
        public final String mo53741g() {
            String packageName = this.f100680a.getPackageName();
            if (packageName == null) {
                C89219l.m154715b();
            }
            return packageName;
        }

        C43192a(IDownloadSdkMonitorDepend iDownloadSdkMonitorDepend) {
            this.f100680a = iDownloadSdkMonitorDepend;
        }
    }

    static {
        Covode.recordClassIndex(51378);
    }
}

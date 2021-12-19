package com.p2082ss.android.ugc.aweme.notification.adapter;

import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.common.C39109f;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.Callable;
import p077b.C1731i;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notification.adapter.a */
public final class C61809a {

    /* renamed from: a */
    public static final C61810a f140305a = new C61810a((byte) 0);

    /* renamed from: b */
    public static final C61809a f140306b = new C61809a();

    /* renamed from: c */
    private static final AbstractC89244h f140307c = C89250i.m154773a((AbstractC89171a) C61812c.f140312a);

    private C61809a() {
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.adapter.a$a */
    public static final class C61810a {
        @AbstractC27891c(mo46611a = "enable")

        /* renamed from: a */
        public final boolean f140308a;
        @AbstractC27891c(mo46611a = "enable_monitor")

        /* renamed from: b */
        public final boolean f140309b;

        static {
            Covode.recordClassIndex(72546);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C61810a)) {
                return false;
            }
            C61810a aVar = (C61810a) obj;
            return this.f140308a == aVar.f140308a && this.f140309b == aVar.f140309b;
        }

        public final int hashCode() {
            boolean z = this.f140308a;
            int i = 1;
            if (z) {
                z = true;
            }
            int i2 = z ? 1 : 0;
            int i3 = z ? 1 : 0;
            int i4 = z ? 1 : 0;
            int i5 = i2 * 31;
            if (!this.f140309b) {
                i = 0;
            }
            return i5 + i;
        }

        public final String toString() {
            return "Meta(enable=" + this.f140308a + ", enableMonitor=" + this.f140309b + ")";
        }

        private C61810a() {
            this.f140308a = false;
            this.f140309b = true;
        }

        public /* synthetic */ C61810a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.adapter.a$c */
    static final class C61812c extends AbstractC89220m implements AbstractC89171a<C61810a> {

        /* renamed from: a */
        public static final C61812c f140312a = new C61812c();

        static {
            Covode.recordClassIndex(72548);
        }

        C61812c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C61810a invoke() {
            Object a = SettingsManager.m29616a().mo25397a("inbox_adapter_fixer", C61810a.class, C61809a.f140305a);
            if (a == null) {
                return C61809a.f140305a;
            }
            return a;
        }
    }

    static {
        Covode.recordClassIndex(72545);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.notification.adapter.a$b */
    public static final class CallableC61811b<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ List f140310a;

        /* renamed from: b */
        final /* synthetic */ Throwable f140311b;

        static {
            Covode.recordClassIndex(72547);
        }

        CallableC61811b(List list, Throwable th) {
            this.f140310a = list;
            this.f140311b = th;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: java.util.LinkedHashMap */
        /* JADX DEBUG: Multi-variable search result rejected for r3v2, resolved type: java.util.LinkedHashMap */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            String str;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int size = this.f140310a.size();
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                MusNotice musNotice = (MusNotice) this.f140310a.get(i);
                int hashCode = musNotice.hashCode();
                if (linkedHashMap.get(Integer.valueOf(hashCode)) == null) {
                    linkedHashMap.put(Integer.valueOf(hashCode), Integer.valueOf(i));
                    i++;
                } else {
                    int i2 = musNotice.type;
                    Object obj = linkedHashMap.get(Integer.valueOf(hashCode));
                    if (obj == null) {
                        C89219l.m154715b();
                    }
                    int intValue = ((Number) obj).intValue();
                    if (this.f140310a.get(intValue) == musNotice) {
                        z = true;
                    }
                    if (intValue >= 0) {
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        linkedHashMap2.put("notice_type", String.valueOf(i2));
                        linkedHashMap2.put("first_index", String.valueOf(intValue));
                        linkedHashMap2.put("second_index", String.valueOf(i));
                        if (z) {
                            str = "1";
                        } else {
                            str = "0";
                        }
                        linkedHashMap2.put("real_equal", str);
                        List<MusNotice> list = this.f140310a;
                        ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) list, 10));
                        for (MusNotice musNotice2 : list) {
                            arrayList.add(Integer.valueOf(musNotice2.type));
                        }
                        linkedHashMap2.put("notice_list", arrayList.toString());
                        C39162r.m79460a("inbox_adapter_dup_ele", linkedHashMap2);
                        C39109f.m79404c("AdapterStableIdFixer", "asyncCheckData, duplicate params: ".concat(String.valueOf(linkedHashMap2)));
                        C39109f.m79404c("AdapterStableIdFixer", "asyncCheckData, stack: " + Log.getStackTraceString(this.f140311b));
                    }
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public static void m111874a(List<? extends MusNotice> list) {
        C89219l.m154721d(list, "");
        if (((C61810a) f140307c.getValue()).f140309b) {
            C1731i.m5640b(new CallableC61811b(list, new Throwable()), C1731i.f5562a);
        }
    }
}

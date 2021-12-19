package com.ttnet.org.chromium.net;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.ttnet.org.chromium.net.AbstractC87529ab;
import com.ttnet.org.chromium.net.AbstractC87671w;
import com.ttnet.org.chromium.net.AbstractC87674x;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: com.ttnet.org.chromium.net.c */
public abstract class AbstractC87536c {

    /* renamed from: a */
    public static final String f198617a = AbstractC87536c.class.getSimpleName();

    /* renamed from: a */
    public abstract AbstractC87529ab.AbstractC87530a mo141712a(String str, AbstractC87529ab.AbstractC87531b bVar, Executor executor);

    /* renamed from: a */
    public abstract AbstractC87671w.AbstractC87672a mo141713a(AbstractC87671w.AbstractC87673b bVar);

    /* renamed from: a */
    public abstract AbstractC87674x.AbstractC87675a mo141714a(AbstractC87674x.AbstractC87676b bVar, Executor executor);

    /* renamed from: a */
    public abstract URLConnection mo141715a(URL url);

    /* renamed from: com.ttnet.org.chromium.net.c$a */
    public static class C87537a {

        /* renamed from: a */
        public final AbstractC87547i f198618a;

        /* renamed from: com.ttnet.org.chromium.net.c$a$a */
        public static abstract class AbstractC87539a {
            static {
                Covode.recordClassIndex(103504);
            }

            public abstract void loadLibrary(String str);
        }

        static {
            Covode.recordClassIndex(103502);
        }

        /* renamed from: a */
        public C87537a mo141723a(String str) {
            this.f198618a.mo141826f(str);
            return this;
        }

        /* renamed from: a */
        public C87537a mo141727a(boolean z) {
            this.f198618a.mo141817b(z);
            return this;
        }

        /* renamed from: a */
        public C87537a mo141725a(ArrayList<byte[]> arrayList) {
            this.f198618a.mo141812a(arrayList);
            return this;
        }

        /* renamed from: a */
        public C87537a mo141726a(Map<String[], Pair<byte[], byte[]>> map) {
            this.f198618a.mo141813a(map);
            return this;
        }

        /* renamed from: a */
        public C87537a mo141724a(String str, int i, int i2) {
            this.f198618a.mo141811a(str, i, i2);
            return this;
        }

        /* renamed from: a */
        public C87537a mo141716a() {
            this.f198618a.mo141802a();
            return this;
        }

        public C87537a(AbstractC87547i iVar) {
            this.f198618a = iVar;
        }

        /* renamed from: b */
        public C87537a mo141728b(String str) {
            this.f198618a.mo141824e(str);
            return this;
        }

        /* renamed from: c */
        public C87537a mo141730c(String str) {
            this.f198618a.mo141810a(str);
            return this;
        }

        /* renamed from: d */
        public C87537a mo141732d(String str) {
            this.f198618a.mo141816b(str);
            return this;
        }

        /* renamed from: e */
        public C87537a mo141734e(String str) {
            this.f198618a.mo141819c(str);
            return this;
        }

        /* renamed from: f */
        public C87537a mo141736f(String str) {
            this.f198618a.mo141822d(str);
            return this;
        }

        /* renamed from: b */
        public C87537a mo141729b(boolean z) {
            this.f198618a.mo141814a(z);
            return this;
        }

        /* renamed from: c */
        public C87537a mo141731c(boolean z) {
            this.f198618a.mo141820c(z);
            return this;
        }

        /* renamed from: d */
        public C87537a mo141733d(boolean z) {
            this.f198618a.mo141823d(z);
            return this;
        }

        /* renamed from: e */
        public C87537a mo141735e(boolean z) {
            this.f198618a.mo141825e(z);
            return this;
        }

        /* renamed from: a */
        public C87537a mo141718a(long j) {
            this.f198618a.mo141805a(j);
            return this;
        }

        /* renamed from: a */
        private static List<AbstractC87541e> m151979a(List<AbstractC87541e> list) {
            if (list.size() != 0) {
                Iterator<AbstractC87541e> it = list.iterator();
                while (it.hasNext()) {
                    it.next();
                }
                if (list.size() != 0) {
                    Collections.sort(list, new Comparator<AbstractC87541e>() {
                        /* class com.ttnet.org.chromium.net.AbstractC87536c.C87537a.C875381 */

                        static {
                            Covode.recordClassIndex(103503);
                        }

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                        @Override // java.util.Comparator
                        public final /* synthetic */ int compare(AbstractC87541e eVar, AbstractC87541e eVar2) {
                            AbstractC87541e eVar3 = eVar;
                            AbstractC87541e eVar4 = eVar2;
                            if ("Fallback-Cronet-Provider".equals(eVar3.mo141740b())) {
                                return 1;
                            }
                            if ("Fallback-Cronet-Provider".equals(eVar4.mo141740b())) {
                                return -1;
                            }
                            return -C87537a.m151978a(eVar3.mo141741c(), eVar4.mo141741c());
                        }
                    });
                    return list;
                }
                throw new RuntimeException("All available Cronet providers are disabled. A provider should be enabled before it can be used.");
            }
            throw new RuntimeException("Unable to find any Cronet provider. Have you included all necessary jars?");
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C87537a(android.content.Context r5) {
            /*
                r4 = this;
                java.util.ArrayList r2 = new java.util.ArrayList
                java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
                r1.<init>()
                java.lang.String r0 = "com.google.android.gms.net.PlayServicesCronetProvider"
                com.ttnet.org.chromium.net.AbstractC87541e.m152001a(r5, r0, r1)
                java.lang.String r0 = "com.google.android.gms.net.GmsCoreCronetProvider"
                com.ttnet.org.chromium.net.AbstractC87541e.m152001a(r5, r0, r1)
                java.lang.String r0 = "com.ttnet.org.chromium.net.impl.NativeCronetProvider"
                com.ttnet.org.chromium.net.AbstractC87541e.m152001a(r5, r0, r1)
                java.lang.String r0 = "com.ttnet.org.chromium.net.impl.JavaCronetProvider"
                com.ttnet.org.chromium.net.AbstractC87541e.m152001a(r5, r0, r1)
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>(r1)
                java.util.List r0 = java.util.Collections.unmodifiableList(r0)
                r2.<init>(r0)
                java.util.List r0 = m151979a(r2)
                r3 = 0
                java.lang.Object r2 = r0.get(r3)
                com.ttnet.org.chromium.net.e r2 = (com.ttnet.org.chromium.net.AbstractC87541e) r2
                java.lang.String r1 = com.ttnet.org.chromium.net.AbstractC87536c.f198617a
                r0 = 3
                boolean r0 = android.util.Log.isLoggable(r1, r0)
                if (r0 == 0) goto L_0x0045
                r0 = 1
                java.lang.Object[] r1 = new java.lang.Object[r0]
                r1[r3] = r2
                java.lang.String r0 = "Using '%s' provider for creating CronetEngine.Builder."
                com.C1764a.m5928a(r0, r1)
            L_0x0045:
                com.ttnet.org.chromium.net.c$a r0 = r2.mo141739a()
                com.ttnet.org.chromium.net.i r0 = r0.f198618a
                r4.<init>(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.net.AbstractC87536c.C87537a.<init>(android.content.Context):void");
        }

        /* renamed from: a */
        public C87537a mo141719a(TTAppInfoProvider tTAppInfoProvider) {
            this.f198618a.mo141806a(tTAppInfoProvider);
            return this;
        }

        /* renamed from: a */
        public C87537a mo141720a(AbstractC87539a aVar) {
            this.f198618a.mo141807a(aVar);
            return this;
        }

        /* renamed from: a */
        public C87537a mo141721a(AbstractC87658u uVar) {
            this.f198618a.mo141808a(uVar);
            return this;
        }

        /* renamed from: a */
        public C87537a mo141722a(AbstractC87670v vVar) {
            this.f198618a.mo141809a(vVar);
            return this;
        }

        /* renamed from: a */
        public C87537a mo141717a(int i, long j) {
            this.f198618a.mo141804a(i, j);
            return this;
        }

        /* renamed from: a */
        static int m151978a(String str, String str2) {
            if (str == null || str2 == null) {
                throw new IllegalArgumentException("The input values cannot be null");
            }
            String[] split = str.split("\\.");
            String[] split2 = str2.split("\\.");
            int i = 0;
            while (i < split.length && i < split2.length) {
                try {
                    int parseInt = Integer.parseInt(split[i]);
                    int parseInt2 = Integer.parseInt(split2[i]);
                    if (parseInt != parseInt2) {
                        return Integer.signum(parseInt - parseInt2);
                    }
                    i++;
                } catch (NumberFormatException e) {
                    throw new IllegalArgumentException("Unable to convert version segments into integers: " + split[i] + " & " + split2[i], e);
                }
            }
            return Integer.signum(split.length - split2.length);
        }
    }

    static {
        Covode.recordClassIndex(103501);
    }
}

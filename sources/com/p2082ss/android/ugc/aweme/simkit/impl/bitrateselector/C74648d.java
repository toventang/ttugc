package com.p2082ss.android.ugc.aweme.simkit.impl.bitrateselector;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.player.sdk.p3553b.C63059e;
import com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.p4265a.AbstractC81964c;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.simkit.impl.bitrateselector.d */
public final class C74648d {

    /* renamed from: a */
    public static final C74649a f167793a = new C74649a((byte) 0);

    static {
        Covode.recordClassIndex(87471);
    }

    /* renamed from: com.ss.android.ugc.aweme.simkit.impl.bitrateselector.d$a */
    public static final class C74649a {
        static {
            Covode.recordClassIndex(87472);
        }

        private C74649a() {
        }

        /* renamed from: com.ss.android.ugc.aweme.simkit.impl.bitrateselector.d$a$a */
        public static final class C74650a implements AbstractC81964c {

            /* renamed from: a */
            final /* synthetic */ C63059e.C63060a f167794a;

            static {
                Covode.recordClassIndex(87473);
            }

            @Override // com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.p4265a.AbstractC81964c
            public final int getBitRate() {
                return this.f167794a.f143252a;
            }

            @Override // com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.p4265a.AbstractC81964c
            public final String getChecksum() {
                return this.f167794a.f143258g;
            }

            @Override // com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.p4265a.AbstractC81964c
            public final String getGearName() {
                return this.f167794a.f143253b;
            }

            @Override // com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.p4265a.AbstractC81964c
            public final int getQualityType() {
                return this.f167794a.f143254c;
            }

            @Override // com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.p4265a.AbstractC81964c
            public final int getSize() {
                return this.f167794a.f143259h;
            }

            @Override // com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.p4265a.AbstractC81964c
            public final String getUrlKey() {
                return this.f167794a.f143256e;
            }

            @Override // com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.p4265a.AbstractC81964c
            public final int isBytevc1() {
                return this.f167794a.f143255d;
            }

            @Override // com.p2082ss.android.ugc.p4261f.p4262a.p4263a.p4264a.p4265a.AbstractC81964c
            public final List<String> urlList() {
                return this.f167794a.f143257f;
            }

            C74650a(C63059e.C63060a aVar) {
                this.f167794a = aVar;
            }
        }

        public /* synthetic */ C74649a(byte b) {
            this();
        }
    }
}

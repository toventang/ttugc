package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.android.gms.internal.measurement.AbstractC25981gj;
import com.google.android.gms.internal.measurement.C25773am;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.at */
public final class C25794at {
    static {
        Covode.recordClassIndex(31209);
    }

    /* renamed from: com.google.android.gms.internal.measurement.at$a */
    public static final class C25795a extends AbstractC25981gj<C25795a, C25796a> {
        static final C25795a zzh;
        private static volatile AbstractC26034id<C25795a> zzi;
        int zzc;
        public String zzd = "";
        public boolean zze;
        public boolean zzf;
        public int zzg;

        /* renamed from: com.google.android.gms.internal.measurement.at$a$a */
        public static final class C25796a extends AbstractC25981gj.AbstractC25982a<C25795a, C25796a> {
            static {
                Covode.recordClassIndex(31211);
            }

            private C25796a() {
                super(C25795a.zzh);
            }

            /* Return type fixed from 'java.lang.String' to match base method */
            @Override // com.google.android.gms.internal.measurement.AbstractC25981gj.AbstractC25982a
            /* renamed from: a */
            public final C25795a mo42007a() {
                return ((C25795a) this.f61239a).zzd;
            }

            /* renamed from: b */
            public final boolean mo42045b() {
                return ((C25795a) this.f61239a).zze;
            }

            /* renamed from: c */
            public final boolean mo42046c() {
                return ((C25795a) this.f61239a).zzf;
            }

            /* renamed from: e */
            public final int mo42048e() {
                return ((C25795a) this.f61239a).zzg;
            }

            /* renamed from: d */
            public final boolean mo42047d() {
                if ((((C25795a) this.f61239a).zzc & 8) != 0) {
                    return true;
                }
                return false;
            }

            /* synthetic */ C25796a(byte b) {
                this();
            }

            /* renamed from: a */
            public final C25796a mo42018a(String str) {
                if (this.f61240b) {
                    mo42626t();
                    this.f61240b = false;
                }
                C25795a aVar = (C25795a) this.f61239a;
                str.getClass();
                aVar.zzc |= 1;
                aVar.zzd = str;
                return this;
            }
        }

        private C25795a() {
        }

        static {
            Covode.recordClassIndex(31210);
            C25795a aVar = new C25795a();
            zzh = aVar;
            AbstractC25981gj.m50560a(C25795a.class, aVar);
        }

        /* access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.measurement.AbstractC25981gj
        /* renamed from: a */
        public final Object mo42005a(int i) {
            MethodCollector.m26663i(7887);
            switch (C25792ar.f60922a[i - 1]) {
                case 1:
                    C25795a aVar = new C25795a();
                    MethodCollector.m26664o(7887);
                    return aVar;
                case 2:
                    C25796a aVar2 = new C25796a((byte) 0);
                    MethodCollector.m26664o(7887);
                    return aVar2;
                case 3:
                    Object a = m50558a(zzh, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg"});
                    MethodCollector.m26664o(7887);
                    return a;
                case 4:
                    C25795a aVar3 = zzh;
                    MethodCollector.m26664o(7887);
                    return aVar3;
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                    AbstractC26034id<C25795a> idVar = zzi;
                    if (idVar == null) {
                        synchronized (C25795a.class) {
                            try {
                                idVar = zzi;
                                if (idVar == null) {
                                    idVar = new AbstractC25981gj.C25984c<>(zzh);
                                    zzi = idVar;
                                }
                            } finally {
                                MethodCollector.m26664o(7887);
                            }
                        }
                    }
                    return idVar;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                    MethodCollector.m26664o(7887);
                    return (byte) 1;
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                    MethodCollector.m26664o(7887);
                    return null;
                default:
                    UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
                    MethodCollector.m26664o(7887);
                    throw unsupportedOperationException;
            }
        }
    }

    /* renamed from: com.google.android.gms.internal.measurement.at$b */
    public static final class C25797b extends AbstractC25981gj<C25797b, C25798a> {
        public static final C25797b zzl;
        private static volatile AbstractC26034id<C25797b> zzm;
        public int zzc;
        public long zzd;
        public String zze = "";
        private int zzf;
        public AbstractC25995gs<C25799c> zzg = C26035ie.f61328a;
        AbstractC25995gs<C25795a> zzh = C26035ie.f61328a;
        public AbstractC25995gs<C25773am.C25774a> zzi = C26035ie.f61328a;
        private String zzj = "";
        public boolean zzk;

        /* renamed from: com.google.android.gms.internal.measurement.at$b$a */
        public static final class C25798a extends AbstractC25981gj.AbstractC25982a<C25797b, C25798a> {
            static {
                Covode.recordClassIndex(31213);
            }

            private C25798a() {
                super(C25797b.zzl);
            }

            /* Return type fixed from 'int' to match base method */
            @Override // com.google.android.gms.internal.measurement.AbstractC25981gj.AbstractC25982a
            /* renamed from: a */
            public final C25797b mo42007a() {
                return ((C25797b) this.f61239a).zzh.size();
            }

            /* renamed from: b */
            public final List<C25773am.C25774a> mo42052b() {
                return Collections.unmodifiableList(((C25797b) this.f61239a).zzi);
            }

            /* renamed from: c */
            public final C25798a mo42053c() {
                if (this.f61240b) {
                    mo42626t();
                    this.f61240b = false;
                }
                ((C25797b) this.f61239a).zzi = C26035ie.f61328a;
                return this;
            }

            /* synthetic */ C25798a(byte b) {
                this();
            }

            /* renamed from: a */
            public final C25795a mo42050a(int i) {
                return ((C25797b) this.f61239a).zzh.get(i);
            }

            /* renamed from: a */
            public final C25798a mo42051a(int i, C25795a.C25796a aVar) {
                if (this.f61240b) {
                    mo42626t();
                    this.f61240b = false;
                }
                C25797b.m49807a((C25797b) this.f61239a, i, (C25795a) aVar.mo42629w());
                return this;
            }
        }

        /* renamed from: b */
        public static C25798a m49808b() {
            return (C25798a) zzl.mo42619j();
        }

        /* renamed from: a */
        public final boolean mo42049a() {
            if ((this.zzc & 1) != 0) {
                return true;
            }
            return false;
        }

        static {
            Covode.recordClassIndex(31212);
            C25797b bVar = new C25797b();
            zzl = bVar;
            AbstractC25981gj.m50560a(C25797b.class, bVar);
        }

        private C25797b() {
        }

        /* access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.measurement.AbstractC25981gj
        /* renamed from: a */
        public final Object mo42005a(int i) {
            MethodCollector.m26663i(7890);
            switch (C25792ar.f60922a[i - 1]) {
                case 1:
                    C25797b bVar = new C25797b();
                    MethodCollector.m26664o(7890);
                    return bVar;
                case 2:
                    C25798a aVar = new C25798a((byte) 0);
                    MethodCollector.m26664o(7890);
                    return aVar;
                case 3:
                    Object a = m50558a(zzl, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0003\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", C25799c.class, "zzh", C25795a.class, "zzi", C25773am.C25774a.class, "zzj", "zzk"});
                    MethodCollector.m26664o(7890);
                    return a;
                case 4:
                    C25797b bVar2 = zzl;
                    MethodCollector.m26664o(7890);
                    return bVar2;
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                    AbstractC26034id<C25797b> idVar = zzm;
                    if (idVar == null) {
                        synchronized (C25797b.class) {
                            try {
                                idVar = zzm;
                                if (idVar == null) {
                                    idVar = new AbstractC25981gj.C25984c<>(zzl);
                                    zzm = idVar;
                                }
                            } finally {
                                MethodCollector.m26664o(7890);
                            }
                        }
                    }
                    return idVar;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                    MethodCollector.m26664o(7890);
                    return (byte) 1;
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                    MethodCollector.m26664o(7890);
                    return null;
                default:
                    UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
                    MethodCollector.m26664o(7890);
                    throw unsupportedOperationException;
            }
        }

        /* renamed from: a */
        static /* synthetic */ void m49807a(C25797b bVar, int i, C25795a aVar) {
            aVar.getClass();
            AbstractC25995gs<C25795a> gsVar = bVar.zzh;
            if (!gsVar.mo42366a()) {
                bVar.zzh = AbstractC25981gj.m50557a(gsVar);
            }
            bVar.zzh.set(i, aVar);
        }
    }

    /* renamed from: com.google.android.gms.internal.measurement.at$c */
    public static final class C25799c extends AbstractC25981gj<C25799c, C25800a> {
        static final C25799c zzf;
        private static volatile AbstractC26034id<C25799c> zzg;
        private int zzc;
        public String zzd = "";
        public String zze = "";

        /* renamed from: com.google.android.gms.internal.measurement.at$c$a */
        public static final class C25800a extends AbstractC25981gj.AbstractC25982a<C25799c, C25800a> {
            static {
                Covode.recordClassIndex(31215);
            }

            private C25800a() {
                super(C25799c.zzf);
            }

            /* synthetic */ C25800a(byte b) {
                this();
            }
        }

        private C25799c() {
        }

        static {
            Covode.recordClassIndex(31214);
            C25799c cVar = new C25799c();
            zzf = cVar;
            AbstractC25981gj.m50560a(C25799c.class, cVar);
        }

        /* access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.measurement.AbstractC25981gj
        /* renamed from: a */
        public final Object mo42005a(int i) {
            MethodCollector.m26663i(7880);
            switch (C25792ar.f60922a[i - 1]) {
                case 1:
                    C25799c cVar = new C25799c();
                    MethodCollector.m26664o(7880);
                    return cVar;
                case 2:
                    C25800a aVar = new C25800a((byte) 0);
                    MethodCollector.m26664o(7880);
                    return aVar;
                case 3:
                    Object a = m50558a(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzc", "zzd", "zze"});
                    MethodCollector.m26664o(7880);
                    return a;
                case 4:
                    C25799c cVar2 = zzf;
                    MethodCollector.m26664o(7880);
                    return cVar2;
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                    AbstractC26034id<C25799c> idVar = zzg;
                    if (idVar == null) {
                        synchronized (C25799c.class) {
                            try {
                                idVar = zzg;
                                if (idVar == null) {
                                    idVar = new AbstractC25981gj.C25984c<>(zzf);
                                    zzg = idVar;
                                }
                            } finally {
                                MethodCollector.m26664o(7880);
                            }
                        }
                    }
                    return idVar;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                    MethodCollector.m26664o(7880);
                    return (byte) 1;
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                    MethodCollector.m26664o(7880);
                    return null;
                default:
                    UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
                    MethodCollector.m26664o(7880);
                    throw unsupportedOperationException;
            }
        }
    }
}

package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.android.gms.internal.measurement.AbstractC25981gj;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.av */
public final class C25802av {

    /* renamed from: com.google.android.gms.internal.measurement.av$c */
    public static final class C25807c extends AbstractC25981gj<C25807c, C25808a> {
        static final C25807c zzi;
        private static volatile AbstractC26034id<C25807c> zzj;
        public int zzc;
        public AbstractC25995gs<C25811e> zzd = C26035ie.f61328a;
        public String zze = "";
        public long zzf;
        public long zzg;
        public int zzh;

        /* renamed from: com.google.android.gms.internal.measurement.av$c$a */
        public static final class C25808a extends AbstractC25981gj.AbstractC25982a<C25807c, C25808a> {
            static {
                Covode.recordClassIndex(31223);
            }

            /* Return type fixed from 'java.util.List<com.google.android.gms.internal.measurement.av$e>' to match base method */
            @Override // com.google.android.gms.internal.measurement.AbstractC25981gj.AbstractC25982a
            /* renamed from: a */
            public final C25807c mo42007a() {
                return Collections.unmodifiableList(((C25807c) this.f61239a).zzd);
            }

            private C25808a() {
                super(C25807c.zzi);
            }

            /* renamed from: d */
            public final String mo42076d() {
                return ((C25807c) this.f61239a).zze;
            }

            /* renamed from: f */
            public final long mo42078f() {
                return ((C25807c) this.f61239a).zzf;
            }

            /* renamed from: g */
            public final long mo42079g() {
                return ((C25807c) this.f61239a).zzg;
            }

            /* renamed from: b */
            public final int mo42072b() {
                return ((C25807c) this.f61239a).mo42063a();
            }

            /* renamed from: e */
            public final boolean mo42077e() {
                return ((C25807c) this.f61239a).mo42064b();
            }

            /* renamed from: c */
            public final C25808a mo42075c() {
                if (this.f61240b) {
                    mo42626t();
                    this.f61240b = false;
                }
                ((C25807c) this.f61239a).zzd = C26035ie.f61328a;
                return this;
            }

            /* synthetic */ C25808a(byte b) {
                this();
            }

            /* renamed from: a */
            public final C25811e mo42071a(int i) {
                return ((C25807c) this.f61239a).zzd.get(i);
            }

            /* renamed from: b */
            public final C25808a mo42073b(int i) {
                if (this.f61240b) {
                    mo42626t();
                    this.f61240b = false;
                }
                C25807c.m49830a((C25807c) this.f61239a, i);
                return this;
            }

            /* renamed from: b */
            public final C25808a mo42074b(long j) {
                if (this.f61240b) {
                    mo42626t();
                    this.f61240b = false;
                }
                C25807c cVar = (C25807c) this.f61239a;
                cVar.zzc |= 4;
                cVar.zzg = j;
                return this;
            }

            /* renamed from: a */
            public final C25808a mo42067a(long j) {
                if (this.f61240b) {
                    mo42626t();
                    this.f61240b = false;
                }
                C25807c cVar = (C25807c) this.f61239a;
                cVar.zzc |= 2;
                cVar.zzf = j;
                return this;
            }

            /* renamed from: a */
            public final C25808a mo42068a(C25811e.C25812a aVar) {
                if (this.f61240b) {
                    mo42626t();
                    this.f61240b = false;
                }
                C25807c.m49832a((C25807c) this.f61239a, (C25811e) aVar.mo42629w());
                return this;
            }

            /* renamed from: a */
            public final C25808a mo42069a(C25811e eVar) {
                if (this.f61240b) {
                    mo42626t();
                    this.f61240b = false;
                }
                C25807c.m49832a((C25807c) this.f61239a, eVar);
                return this;
            }

            /* renamed from: a */
            public final C25808a mo42070a(Iterable<? extends C25811e> iterable) {
                if (this.f61240b) {
                    mo42626t();
                    this.f61240b = false;
                }
                C25807c.m49833a((C25807c) this.f61239a, iterable);
                return this;
            }

            /* renamed from: a */
            public final C25808a mo42018a(String str) {
                if (this.f61240b) {
                    mo42626t();
                    this.f61240b = false;
                }
                C25807c cVar = (C25807c) this.f61239a;
                str.getClass();
                cVar.zzc |= 1;
                cVar.zze = str;
                return this;
            }

            /* renamed from: a */
            public final C25808a mo42065a(int i, C25811e.C25812a aVar) {
                if (this.f61240b) {
                    mo42626t();
                    this.f61240b = false;
                }
                C25807c.m49831a((C25807c) this.f61239a, i, (C25811e) aVar.mo42629w());
                return this;
            }

            /* renamed from: a */
            public final C25808a mo42066a(int i, C25811e eVar) {
                if (this.f61240b) {
                    mo42626t();
                    this.f61240b = false;
                }
                C25807c.m49831a((C25807c) this.f61239a, i, eVar);
                return this;
            }
        }

        /* renamed from: a */
        public final int mo42063a() {
            return this.zzd.size();
        }

        private C25807c() {
        }

        /* renamed from: c */
        public static C25808a m49834c() {
            return (C25808a) zzi.mo42619j();
        }

        /* renamed from: d */
        private final void m49835d() {
            AbstractC25995gs<C25811e> gsVar = this.zzd;
            if (!gsVar.mo42366a()) {
                this.zzd = AbstractC25981gj.m50557a(gsVar);
            }
        }

        /* renamed from: b */
        public final boolean mo42064b() {
            if ((this.zzc & 2) != 0) {
                return true;
            }
            return false;
        }

        static {
            Covode.recordClassIndex(31222);
            C25807c cVar = new C25807c();
            zzi = cVar;
            AbstractC25981gj.m50560a(C25807c.class, cVar);
        }

        /* access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.measurement.AbstractC25981gj
        /* renamed from: a */
        public final Object mo42005a(int i) {
            MethodCollector.m26663i(6246);
            switch (C25801au.f60923a[i - 1]) {
                case 1:
                    C25807c cVar = new C25807c();
                    MethodCollector.m26664o(6246);
                    return cVar;
                case 2:
                    C25808a aVar = new C25808a((byte) 0);
                    MethodCollector.m26664o(6246);
                    return aVar;
                case 3:
                    Object a = m50558a(zzi, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003", new Object[]{"zzc", "zzd", C25811e.class, "zze", "zzf", "zzg", "zzh"});
                    MethodCollector.m26664o(6246);
                    return a;
                case 4:
                    C25807c cVar2 = zzi;
                    MethodCollector.m26664o(6246);
                    return cVar2;
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                    AbstractC26034id<C25807c> idVar = zzj;
                    if (idVar == null) {
                        synchronized (C25807c.class) {
                            try {
                                idVar = zzj;
                                if (idVar == null) {
                                    idVar = new AbstractC25981gj.C25984c<>(zzi);
                                    zzj = idVar;
                                }
                            } finally {
                                MethodCollector.m26664o(6246);
                            }
                        }
                    }
                    return idVar;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                    MethodCollector.m26664o(6246);
                    return (byte) 1;
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                    MethodCollector.m26664o(6246);
                    return null;
                default:
                    UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
                    MethodCollector.m26664o(6246);
                    throw unsupportedOperationException;
            }
        }

        /* renamed from: a */
        static /* synthetic */ void m49830a(C25807c cVar, int i) {
            cVar.m49835d();
            cVar.zzd.remove(i);
        }

        /* renamed from: a */
        static /* synthetic */ void m49832a(C25807c cVar, C25811e eVar) {
            eVar.getClass();
            cVar.m49835d();
            cVar.zzd.add(eVar);
        }

        /* renamed from: a */
        static /* synthetic */ void m49833a(C25807c cVar, Iterable iterable) {
            cVar.m49835d();
            AbstractC25931es.m50179a(iterable, cVar.zzd);
        }

        /* renamed from: a */
        static /* synthetic */ void m49831a(C25807c cVar, int i, C25811e eVar) {
            eVar.getClass();
            cVar.m49835d();
            cVar.zzd.set(i, eVar);
        }
    }

    /* renamed from: com.google.android.gms.internal.measurement.av$h */
    public static final class C25817h extends AbstractC25981gj<C25817h, C25818a> {
        static final C25817h zzf;
        private static volatile AbstractC26034id<C25817h> zzg;
        private int zzc;
        private int zzd = 1;
        private AbstractC25995gs<C25809d> zze = C26035ie.f61328a;

        /* renamed from: com.google.android.gms.internal.measurement.av$h$b */
        public enum EnumC25819b implements AbstractC25988gl {
            RADS(1),
            PROVISIONING(2);
            

            /* renamed from: c */
            private static final AbstractC25991go<EnumC25819b> f60926c = new C25826aw();

            /* renamed from: d */
            private final int f60928d;

            public static AbstractC25990gn zzb() {
                return C25827ax.f60929a;
            }

            @Override // com.google.android.gms.internal.measurement.AbstractC25988gl
            public final int zza() {
                return this.f60928d;
            }

            static {
                Covode.recordClassIndex(31234);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("<");
                sb.append(getClass().getName()).append('@').append(Integer.toHexString(System.identityHashCode(this)));
                sb.append(" number=").append(this.f60928d);
                return sb.append(" name=").append(name()).append('>').toString();
            }

            public static EnumC25819b zza(int i) {
                if (i == 1) {
                    return RADS;
                }
                if (i != 2) {
                    return null;
                }
                return PROVISIONING;
            }

            private EnumC25819b(int i) {
                this.f60928d = i;
            }
        }

        /* renamed from: com.google.android.gms.internal.measurement.av$h$a */
        public static final class C25818a extends AbstractC25981gj.AbstractC25982a<C25817h, C25818a> {
            static {
                Covode.recordClassIndex(31233);
            }

            private C25818a() {
                super(C25817h.zzf);
            }

            /* synthetic */ C25818a(byte b) {
                this();
            }

            /* renamed from: a */
            public final C25818a mo42159a(C25809d.C25810a aVar) {
                if (this.f61240b) {
                    mo42626t();
                    this.f61240b = false;
                }
                C25817h.m49966a((C25817h) this.f61239a, (C25809d) aVar.mo42629w());
                return this;
            }
        }

        private C25817h() {
        }

        /* renamed from: a */
        public static C25818a m49965a() {
            return (C25818a) zzf.mo42619j();
        }

        static {
            Covode.recordClassIndex(31232);
            C25817h hVar = new C25817h();
            zzf = hVar;
            AbstractC25981gj.m50560a(C25817h.class, hVar);
        }

        /* access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.measurement.AbstractC25981gj
        /* renamed from: a */
        public final Object mo42005a(int i) {
            MethodCollector.m26663i(7096);
            switch (C25801au.f60923a[i - 1]) {
                case 1:
                    C25817h hVar = new C25817h();
                    MethodCollector.m26664o(7096);
                    return hVar;
                case 2:
                    C25818a aVar = new C25818a((byte) 0);
                    MethodCollector.m26664o(7096);
                    return aVar;
                case 3:
                    Object a = m50558a(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b", new Object[]{"zzc", "zzd", EnumC25819b.zzb(), "zze", C25809d.class});
                    MethodCollector.m26664o(7096);
                    return a;
                case 4:
                    C25817h hVar2 = zzf;
                    MethodCollector.m26664o(7096);
                    return hVar2;
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                    AbstractC26034id<C25817h> idVar = zzg;
                    if (idVar == null) {
                        synchronized (C25817h.class) {
                            try {
                                idVar = zzg;
                                if (idVar == null) {
                                    idVar = new AbstractC25981gj.C25984c<>(zzf);
                                    zzg = idVar;
                                }
                            } finally {
                                MethodCollector.m26664o(7096);
                            }
                        }
                    }
                    return idVar;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                    MethodCollector.m26664o(7096);
                    return (byte) 1;
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                    MethodCollector.m26664o(7096);
                    return null;
                default:
                    UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
                    MethodCollector.m26664o(7096);
                    throw unsupportedOperationException;
            }
        }

        /* renamed from: a */
        static /* synthetic */ void m49966a(C25817h hVar, C25809d dVar) {
            dVar.getClass();
            AbstractC25995gs<C25809d> gsVar = hVar.zze;
            if (!gsVar.mo42366a()) {
                hVar.zze = AbstractC25981gj.m50557a(gsVar);
            }
            hVar.zze.add(dVar);
        }
    }

    static {
        Covode.recordClassIndex(31217);
    }

    /* renamed from: com.google.android.gms.internal.measurement.av$a */
    public static final class C25803a extends AbstractC25981gj<C25803a, C25804a> {
        static final C25803a zzh;
        private static volatile AbstractC26034id<C25803a> zzi;
        public int zzc;
        public int zzd;
        C25820i zze;
        public C25820i zzf;
        public boolean zzg;

        private C25803a() {
        }

        /* renamed from: com.google.android.gms.internal.measurement.av$a$a */
        public static final class C25804a extends AbstractC25981gj.AbstractC25982a<C25803a, C25804a> {
            static {
                Covode.recordClassIndex(31219);
            }

            private C25804a() {
                super(C25803a.zzh);
            }

            /* synthetic */ C25804a(byte b) {
                this();
            }

            /* renamed from: a */
            public final C25804a mo42055a(int i) {
                if (this.f61240b) {
                    mo42626t();
                    this.f61240b = false;
                }
                C25803a aVar = (C25803a) this.f61239a;
                aVar.zzc |= 1;
                aVar.zzd = i;
                return this;
            }

            /* renamed from: a */
            public final C25804a mo42056a(C25820i.C25821a aVar) {
                if (this.f61240b) {
                    mo42626t();
                    this.f61240b = false;
                }
                C25803a aVar2 = (C25803a) this.f61239a;
                C25820i iVar = (C25820i) aVar.mo42629w();
                iVar.getClass();
                aVar2.zze = iVar;
                aVar2.zzc |= 2;
                return this;
            }

            /* renamed from: a */
            public final C25804a mo42057a(C25820i iVar) {
                if (this.f61240b) {
                    mo42626t();
                    this.f61240b = false;
                }
                C25803a aVar = (C25803a) this.f61239a;
                iVar.getClass();
                aVar.zzf = iVar;
                aVar.zzc |= 4;
                return this;
            }

            /* renamed from: a */
            public final C25804a mo42058a(boolean z) {
                if (this.f61240b) {
                    mo42626t();
                    this.f61240b = false;
                }
                C25803a aVar = (C25803a) this.f61239a;
                aVar.zzc |= 8;
                aVar.zzg = z;
                return this;
            }
        }

        /* renamed from: a */
        public final C25820i mo42054a() {
            C25820i iVar = this.zze;
            if (iVar == null) {
                return C25820i.zzg;
            }
            return iVar;
        }

        /* renamed from: b */
        public static C25804a m49817b() {
            return (C25804a) zzh.mo42619j();
        }

        static {
            Covode.recordClassIndex(31218);
            C25803a aVar = new C25803a();
            zzh = aVar;
            AbstractC25981gj.m50560a(C25803a.class, aVar);
        }

        /* access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.measurement.AbstractC25981gj
        /* renamed from: a */
        public final Object mo42005a(int i) {
            MethodCollector.m26663i(7557);
            switch (C25801au.f60923a[i - 1]) {
                case 1:
                    C25803a aVar = new C25803a();
                    MethodCollector.m26664o(7557);
                    return aVar;
                case 2:
                    C25804a aVar2 = new C25804a((byte) 0);
                    MethodCollector.m26664o(7557);
                    return aVar2;
                case 3:
                    Object a = m50558a(zzh, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg"});
                    MethodCollector.m26664o(7557);
                    return a;
                case 4:
                    C25803a aVar3 = zzh;
                    MethodCollector.m26664o(7557);
                    return aVar3;
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                    AbstractC26034id<C25803a> idVar = zzi;
                    if (idVar == null) {
                        synchronized (C25803a.class) {
                            try {
                                idVar = zzi;
                                if (idVar == null) {
                                    idVar = new AbstractC25981gj.C25984c<>(zzh);
                                    zzi = idVar;
                                }
                            } finally {
                                MethodCollector.m26664o(7557);
                            }
                        }
                    }
                    return idVar;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                    MethodCollector.m26664o(7557);
                    return (byte) 1;
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                    MethodCollector.m26664o(7557);
                    return null;
                default:
                    UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
                    MethodCollector.m26664o(7557);
                    throw unsupportedOperationException;
            }
        }
    }

    /* renamed from: com.google.android.gms.internal.measurement.av$b */
    public static final class C25805b extends AbstractC25981gj<C25805b, C25806a> {
        static final C25805b zzf;
        private static volatile AbstractC26034id<C25805b> zzg;
        int zzc;
        public int zzd;
        public long zze;

        private C25805b() {
        }

        /* renamed from: com.google.android.gms.internal.measurement.av$b$a */
        public static final class C25806a extends AbstractC25981gj.AbstractC25982a<C25805b, C25806a> {
            static {
                Covode.recordClassIndex(31221);
            }

            private C25806a() {
                super(C25805b.zzf);
            }

            /* synthetic */ C25806a(byte b) {
                this();
            }

            /* renamed from: a */
            public final C25806a mo42061a(int i) {
                if (this.f61240b) {
                    mo42626t();
                    this.f61240b = false;
                }
                C25805b bVar = (C25805b) this.f61239a;
                bVar.zzc |= 1;
                bVar.zzd = i;
                return this;
            }

            /* renamed from: a */
            public final C25806a mo42062a(long j) {
                if (this.f61240b) {
                    mo42626t();
                    this.f61240b = false;
                }
                C25805b bVar = (C25805b) this.f61239a;
                bVar.zzc |= 2;
                bVar.zze = j;
                return this;
            }
        }

        /* renamed from: c */
        public static C25806a m49824c() {
            return (C25806a) zzf.mo42619j();
        }

        /* renamed from: a */
        public final boolean mo42059a() {
            if ((this.zzc & 1) != 0) {
                return true;
            }
            return false;
        }

        /* renamed from: b */
        public final boolean mo42060b() {
            if ((this.zzc & 2) != 0) {
                return true;
            }
            return false;
        }

        static {
            Covode.recordClassIndex(31220);
            C25805b bVar = new C25805b();
            zzf = bVar;
            AbstractC25981gj.m50560a(C25805b.class, bVar);
        }

        /* access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.measurement.AbstractC25981gj
        /* renamed from: a */
        public final Object mo42005a(int i) {
            MethodCollector.m26663i(7552);
            switch (C25801au.f60923a[i - 1]) {
                case 1:
                    C25805b bVar = new C25805b();
                    MethodCollector.m26664o(7552);
                    return bVar;
                case 2:
                    C25806a aVar = new C25806a((byte) 0);
                    MethodCollector.m26664o(7552);
                    return aVar;
                case 3:
                    Object a = m50558a(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"zzc", "zzd", "zze"});
                    MethodCollector.m26664o(7552);
                    return a;
                case 4:
                    C25805b bVar2 = zzf;
                    MethodCollector.m26664o(7552);
                    return bVar2;
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                    AbstractC26034id<C25805b> idVar = zzg;
                    if (idVar == null) {
                        synchronized (C25805b.class) {
                            try {
                                idVar = zzg;
                                if (idVar == null) {
                                    idVar = new AbstractC25981gj.C25984c<>(zzf);
                                    zzg = idVar;
                                }
                            } finally {
                                MethodCollector.m26664o(7552);
                            }
                        }
                    }
                    return idVar;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                    MethodCollector.m26664o(7552);
                    return (byte) 1;
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                    MethodCollector.m26664o(7552);
                    return null;
                default:
                    UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
                    MethodCollector.m26664o(7552);
                    throw unsupportedOperationException;
            }
        }
    }

    /* renamed from: com.google.android.gms.internal.measurement.av$g */
    public static final class C25815g extends AbstractC25981gj<C25815g, C25816a> {
        static final C25815g zzaw;
        private static volatile AbstractC26034id<C25815g> zzax;
        public int zzaa;
        public String zzab = "";
        public String zzac = "";
        public boolean zzad;
        public AbstractC25995gs<C25803a> zzae = C26035ie.f61328a;
        public String zzaf = "";
        public int zzag;
        private int zzah;
        private int zzai;
        public String zzaj = "";
        public long zzak;
        public long zzal;
        public String zzam = "";
        private String zzan = "";
        public int zzao;
        public String zzap = "";
        C25817h zzaq;
        private AbstractC25993gq zzar = C25987gk.f61257a;
        public long zzas;
        long zzat;
        public String zzau = "";
        private String zzav = "";
        public int zzc;
        public int zzd;
        public int zze;
        public AbstractC25995gs<C25807c> zzf = C26035ie.f61328a;
        public AbstractC25995gs<C25824k> zzg = C26035ie.f61328a;
        public long zzh;
        public long zzi;
        public long zzj;
        public long zzk;
        public long zzl;
        public String zzm = "";
        public String zzn = "";
        public String zzo = "";
        public String zzp = "";
        public int zzq;
        public String zzr = "";
        public String zzs = "";
        public String zzt = "";
        public long zzu;
        public long zzv;
        public String zzw = "";
        public boolean zzx;
        public String zzy = "";
        public long zzz;

        /* renamed from: com.google.android.gms.internal.measurement.av$g$a */
        public static final class C25816a extends AbstractC25981gj.AbstractC25982a<C25815g, C25816a> {
            static {
                Covode.recordClassIndex(31231);
            }

            /* renamed from: a */
            public final C25816a mo42105a(Iterable<? extends C25807c> iterable) {
                if (this.f61240b) {
                    mo42626t();
                    this.f61240b = false;
                }
                C25815g.m49890a((C25815g) this.f61239a, iterable);
                return this;
            }

            /* renamed from: a */
            public final C25816a mo42104a(C25824k kVar) {
                if (this.f61240b) {
                    mo42626t();
                    this.f61240b = false;
                }
                C25815g.m49889a((C25815g) this.f61239a, kVar);
                return this;
            }

            /* renamed from: a */
            public final C25816a mo42018a(String str) {
                if (this.f61240b) {
                    mo42626t();
                    this.f61240b = false;
                }
                C25815g gVar = (C25815g) this.f61239a;
                str.getClass();
                gVar.zzc |= 64;
                gVar.zzm = str;
                return this;
            }

            /* renamed from: a */
            public final C25816a mo42106a(boolean z) {
                if (this.f61240b) {
                    mo42626t();
                    this.f61240b = false;
                }
                C25815g gVar = (C25815g) this.f61239a;
                gVar.zzc |= 131072;
                gVar.zzx = z;
                return this;
            }

            private C25816a() {
                super(C25815g.zzaw);
            }

            /* renamed from: g */
            public final long mo42131g() {
                return ((C25815g) this.f61239a).zzi;
            }

            /* renamed from: h */
            public final long mo42135h() {
                return ((C25815g) this.f61239a).zzj;
            }

            /* renamed from: k */
            public final String mo42147k() {
                return ((C25815g) this.f61239a).zzs;
            }

            /* renamed from: n */
            public final String mo42153n() {
                return ((C25815g) this.f61239a).zzac;
            }

            /* renamed from: r */
            public final String mo42158r() {
                return ((C25815g) this.f61239a).zzau;
            }

            /* renamed from: b */
            public final List<C25807c> mo42112b() {
                return Collections.unmodifiableList(((C25815g) this.f61239a).zzf);
            }

            /* renamed from: c */
            public final int mo42113c() {
                return ((C25815g) this.f61239a).zzf.size();
            }

            /* renamed from: e */
            public final List<C25824k> mo42126e() {
                return Collections.unmodifiableList(((C25815g) this.f61239a).zzg);
            }

            /* renamed from: f */
            public final int mo42127f() {
                return ((C25815g) this.f61239a).zzg.size();
            }

            /* Return type fixed from 'com.google.android.gms.internal.measurement.av$g$a' to match base method */
            @Override // com.google.android.gms.internal.measurement.AbstractC25981gj.AbstractC25982a
            /* renamed from: a */
            public final C25815g mo42007a() {
                if (this.f61240b) {
                    mo42626t();
                    this.f61240b = false;
                }
                C25815g gVar = (C25815g) this.f61239a;
                gVar.zzc |= 1;
                gVar.zze = 1;
                return this;
            }

            /* renamed from: d */
            public final C25816a mo42118d() {
                if (this.f61240b) {
                    mo42626t();
                    this.f61240b = false;
                }
                ((C25815g) this.f61239a).zzf = C26035ie.f61328a;
                return this;
            }

            /* renamed from: i */
            public final C25816a mo42139i() {
                if (this.f61240b) {
                    mo42626t();
                    this.f61240b = false;
                }
                C25815g gVar = (C25815g) this.f61239a;
                gVar.zzc &= -17;
                gVar.zzk = 0;
                return this;
            }

            /* renamed from: j */
            public final C25816a mo42142j() {
                if (this.f61240b) {
                    mo42626t();
                    this.f61240b = false;
                }
                C25815g gVar = (C25815g) this.f61239a;
                gVar.zzc &= -33;
                gVar.zzl = 0;
                return this;
            }

            /* renamed from: l */
            public final C25816a mo42148l() {
                if (this.f61240b) {
                    mo42626t();
                    this.f61240b = false;
                }
                C25815g gVar = (C25815g) this.f61239a;
                gVar.zzc |= 32768;
                gVar.zzv = 31000;
                return this;
            }

            /* renamed from: m */
            public final C25816a mo42150m() {
                if (this.f61240b) {
                    mo42626t();
                    this.f61240b = false;
                }
                C25815g gVar = (C25815g) this.f61239a;
                gVar.zzc &= -2097153;
                gVar.zzab = C25815g.zzaw.zzab;
                return this;
            }

            /* renamed from: o */
            public final C25816a mo42154o() {
                if (this.f61240b) {
                    mo42626t();
                    this.f61240b = false;
                }
                ((C25815g) this.f61239a).zzae = C26035ie.f61328a;
                return this;
            }

            /* renamed from: p */
            public final C25816a mo42156p() {
                if (this.f61240b) {
                    mo42626t();
                    this.f61240b = false;
                }
                C25815g gVar = (C25815g) this.f61239a;
                throw new NullPointerException("getClass");
            }

            /* renamed from: q */
            public final C25816a mo42157q() {
                if (this.f61240b) {
                    mo42626t();
                    this.f61240b = false;
                }
                C25815g gVar = (C25815g) this.f61239a;
                gVar.zzc &= Integer.MAX_VALUE;
                gVar.zzam = C25815g.zzaw.zzam;
                return this;
            }

            /* synthetic */ C25816a(byte b) {
                this();
            }

            /* renamed from: a */
            public final C25807c mo42097a(int i) {
                return ((C25815g) this.f61239a).zzf.get(i);
            }

            /* renamed from: b */
            public final C25816a mo42107b(int i) {
                if (this.f61240b) {
                    mo42626t();
                    this.f61240b = false;
                }
                C25815g.m49885a((C25815g) this.f61239a, i);
                return this;
            }

            /* renamed from: c */
            public final C25816a mo42114c(long j) {
                if (this.f61240b) {
                    mo42626t();
                    this.f61240b = false;
                }
                C25815g gVar = (C25815g) this.f61239a;
                gVar.zzc |= 8;
                gVar.zzj = j;
                return this;
            }

            /* renamed from: e */
            public final C25816a mo42123e(int i) {
                if (this.f61240b) {
                    mo42626t();
                    this.f61240b = false;
                }
                C25815g gVar = (C25815g) this.f61239a;
                gVar.zzc |= 1024;
                gVar.zzq = i;
                return this;
            }

            /* renamed from: f */
            public final C25816a mo42128f(int i) {
                if (this.f61240b) {
                    mo42626t();
                    this.f61240b = false;
                }
                C25815g gVar = (C25815g) this.f61239a;
                gVar.zzc |= 1048576;
                gVar.zzaa = i;
                return this;
            }

            /* renamed from: g */
            public final C25816a mo42132g(int i) {
                if (this.f61240b) {
                    mo42626t();
                    this.f61240b = false;
                }
                C25815g gVar = (C25815g) this.f61239a;
                gVar.zzc |= 33554432;
                gVar.zzag = i;
                return this;
            }

            /* renamed from: h */
            public final C25816a mo42136h(int i) {
                if (this.f61240b) {
                    mo42626t();
                    this.f61240b = false;
                }
                C25815g gVar = (C25815g) this.f61239a;
                gVar.zzd |= 2;
                gVar.zzao = i;
                return this;
            }

            /* renamed from: k */
            public final C25816a mo42145k(long j) {
                if (this.f61240b) {
                    mo42626t();
                    this.f61240b = false;
                }
                C25815g gVar = (C25815g) this.f61239a;
                gVar.zzd |= 32;
                gVar.zzat = j;
                return this;
            }

            /* renamed from: n */
            public final C25816a mo42152n(String str) {
                if (this.f61240b) {
                    mo42626t();
                    this.f61240b = false;
                }
                C25815g gVar = (C25815g) this.f61239a;
                str.getClass();
                gVar.zzd |= 4;
                gVar.zzap = str;
                return this;
            }

            /* renamed from: b */
            public final C25816a mo42108b(long j) {
                if (this.f61240b) {
                    mo42626t();
                    this.f61240b = false;
                }
                C25815g gVar = (C25815g) this.f61239a;
                gVar.zzc |= 4;
                gVar.zzi = j;
                return this;
            }

            /* renamed from: c */
            public final C25816a mo42115c(Iterable<? extends C25803a> iterable) {
                if (this.f61240b) {
                    mo42626t();
                    this.f61240b = false;
                }
                C25815g.m49894c((C25815g) this.f61239a, iterable);
                return this;
            }

            /* renamed from: d */
            public final C25816a mo42119d(int i) {
                if (this.f61240b) {
                    mo42626t();
                    this.f61240b = false;
                }
                C25815g.m49891b((C25815g) this.f61239a, i);
                return this;
            }

            /* renamed from: e */
            public final C25816a mo42124e(long j) {
                if (this.f61240b) {
                    mo42626t();
                    this.f61240b = false;
                }
                C25815g gVar = (C25815g) this.f61239a;
                gVar.zzc |= 32;
                gVar.zzl = j;
                return this;
            }

            /* renamed from: f */
            public final C25816a mo42129f(long j) {
                if (this.f61240b) {
                    mo42626t();
                    this.f61240b = false;
                }
                C25815g gVar = (C25815g) this.f61239a;
                gVar.zzc |= 16384;
                gVar.zzu = j;
                return this;
            }

            /* renamed from: g */
            public final C25816a mo42133g(long j) {
                if (this.f61240b) {
                    mo42626t();
                    this.f61240b = false;
                }
                C25815g gVar = (C25815g) this.f61239a;
                gVar.zzc |= 524288;
                gVar.zzz = j;
                return this;
            }

            /* renamed from: h */
            public final C25816a mo42137h(long j) {
                if (this.f61240b) {
                    mo42626t();
                    this.f61240b = false;
                }
                C25815g gVar = (C25815g) this.f61239a;
                gVar.zzc |= 536870912;
                gVar.zzak = j;
                return this;
            }

            /* renamed from: i */
            public final C25816a mo42140i(long j) {
                if (this.f61240b) {
                    mo42626t();
                    this.f61240b = false;
                }
                C25815g gVar = (C25815g) this.f61239a;
                gVar.zzc |= 1073741824;
                gVar.zzal = j;
                return this;
            }

            /* renamed from: j */
            public final C25816a mo42143j(long j) {
                if (this.f61240b) {
                    mo42626t();
                    this.f61240b = false;
                }
                C25815g gVar = (C25815g) this.f61239a;
                gVar.zzd |= 16;
                gVar.zzas = j;
                return this;
            }

            /* renamed from: k */
            public final C25816a mo42146k(String str) {
                if (this.f61240b) {
                    mo42626t();
                    this.f61240b = false;
                }
                C25815g gVar = (C25815g) this.f61239a;
                str.getClass();
                gVar.zzc |= 4194304;
                gVar.zzac = str;
                return this;
            }

            /* renamed from: l */
            public final C25816a mo42149l(String str) {
                if (this.f61240b) {
                    mo42626t();
                    this.f61240b = false;
                }
                C25815g gVar = (C25815g) this.f61239a;
                str.getClass();
                gVar.zzc |= 16777216;
                gVar.zzaf = str;
                return this;
            }

            /* renamed from: m */
            public final C25816a mo42151m(String str) {
                if (this.f61240b) {
                    mo42626t();
                    this.f61240b = false;
                }
                C25815g gVar = (C25815g) this.f61239a;
                str.getClass();
                gVar.zzc |= 268435456;
                gVar.zzaj = str;
                return this;
            }

            /* renamed from: o */
            public final C25816a mo42155o(String str) {
                if (this.f61240b) {
                    mo42626t();
                    this.f61240b = false;
                }
                C25815g gVar = (C25815g) this.f61239a;
                str.getClass();
                gVar.zzd |= 64;
                gVar.zzau = str;
                return this;
            }

            /* renamed from: b */
            public final C25816a mo42109b(Iterable<? extends C25824k> iterable) {
                if (this.f61240b) {
                    mo42626t();
                    this.f61240b = false;
                }
                C25815g.m49892b((C25815g) this.f61239a, iterable);
                return this;
            }

            /* renamed from: c */
            public final C25816a mo42116c(String str) {
                if (this.f61240b) {
                    mo42626t();
                    this.f61240b = false;
                }
                C25815g gVar = (C25815g) this.f61239a;
                str.getClass();
                gVar.zzc |= 256;
                gVar.zzo = str;
                return this;
            }

            /* renamed from: d */
            public final C25816a mo42120d(long j) {
                if (this.f61240b) {
                    mo42626t();
                    this.f61240b = false;
                }
                C25815g gVar = (C25815g) this.f61239a;
                gVar.zzc |= 16;
                gVar.zzk = j;
                return this;
            }

            /* renamed from: e */
            public final C25816a mo42125e(String str) {
                if (this.f61240b) {
                    mo42626t();
                    this.f61240b = false;
                }
                C25815g gVar = (C25815g) this.f61239a;
                str.getClass();
                gVar.zzc |= 2048;
                gVar.zzr = str;
                return this;
            }

            /* renamed from: f */
            public final C25816a mo42130f(String str) {
                if (this.f61240b) {
                    mo42626t();
                    this.f61240b = false;
                }
                C25815g gVar = (C25815g) this.f61239a;
                str.getClass();
                gVar.zzc |= 4096;
                gVar.zzs = str;
                return this;
            }

            /* renamed from: g */
            public final C25816a mo42134g(String str) {
                if (this.f61240b) {
                    mo42626t();
                    this.f61240b = false;
                }
                C25815g gVar = (C25815g) this.f61239a;
                str.getClass();
                gVar.zzc |= 8192;
                gVar.zzt = str;
                return this;
            }

            /* renamed from: h */
            public final C25816a mo42138h(String str) {
                if (this.f61240b) {
                    mo42626t();
                    this.f61240b = false;
                }
                C25815g gVar = (C25815g) this.f61239a;
                str.getClass();
                gVar.zzc |= 65536;
                gVar.zzw = str;
                return this;
            }

            /* renamed from: i */
            public final C25816a mo42141i(String str) {
                if (this.f61240b) {
                    mo42626t();
                    this.f61240b = false;
                }
                C25815g gVar = (C25815g) this.f61239a;
                str.getClass();
                gVar.zzc |= 262144;
                gVar.zzy = str;
                return this;
            }

            /* renamed from: j */
            public final C25816a mo42144j(String str) {
                if (this.f61240b) {
                    mo42626t();
                    this.f61240b = false;
                }
                C25815g gVar = (C25815g) this.f61239a;
                str.getClass();
                gVar.zzc |= 2097152;
                gVar.zzab = str;
                return this;
            }

            /* renamed from: a */
            public final C25816a mo42100a(long j) {
                if (this.f61240b) {
                    mo42626t();
                    this.f61240b = false;
                }
                C25815g gVar = (C25815g) this.f61239a;
                gVar.zzc |= 2;
                gVar.zzh = j;
                return this;
            }

            /* renamed from: b */
            public final C25816a mo42110b(String str) {
                if (this.f61240b) {
                    mo42626t();
                    this.f61240b = false;
                }
                C25815g gVar = (C25815g) this.f61239a;
                str.getClass();
                gVar.zzc |= 128;
                gVar.zzn = str;
                return this;
            }

            /* renamed from: c */
            public final C25824k mo42117c(int i) {
                return ((C25815g) this.f61239a).zzg.get(i);
            }

            /* renamed from: d */
            public final C25816a mo42121d(Iterable<? extends Integer> iterable) {
                if (this.f61240b) {
                    mo42626t();
                    this.f61240b = false;
                }
                C25815g.m49896d((C25815g) this.f61239a, iterable);
                return this;
            }

            /* renamed from: a */
            public final C25816a mo42101a(C25807c.C25808a aVar) {
                if (this.f61240b) {
                    mo42626t();
                    this.f61240b = false;
                }
                C25815g.m49888a((C25815g) this.f61239a, (C25807c) aVar.mo42629w());
                return this;
            }

            /* renamed from: b */
            public final C25816a mo42111b(boolean z) {
                if (this.f61240b) {
                    mo42626t();
                    this.f61240b = false;
                }
                C25815g gVar = (C25815g) this.f61239a;
                gVar.zzc |= 8388608;
                gVar.zzad = z;
                return this;
            }

            /* renamed from: d */
            public final C25816a mo42122d(String str) {
                if (this.f61240b) {
                    mo42626t();
                    this.f61240b = false;
                }
                C25815g gVar = (C25815g) this.f61239a;
                str.getClass();
                gVar.zzc |= 512;
                gVar.zzp = str;
                return this;
            }

            /* renamed from: a */
            public final C25816a mo42102a(C25817h.C25818a aVar) {
                if (this.f61240b) {
                    mo42626t();
                    this.f61240b = false;
                }
                C25815g gVar = (C25815g) this.f61239a;
                C25817h hVar = (C25817h) aVar.mo42629w();
                hVar.getClass();
                gVar.zzaq = hVar;
                gVar.zzd |= 8;
                return this;
            }

            /* renamed from: a */
            public final C25816a mo42103a(C25824k.C25825a aVar) {
                if (this.f61240b) {
                    mo42626t();
                    this.f61240b = false;
                }
                C25815g.m49889a((C25815g) this.f61239a, (C25824k) aVar.mo42629w());
                return this;
            }

            /* renamed from: a */
            public final C25816a mo42098a(int i, C25807c.C25808a aVar) {
                if (this.f61240b) {
                    mo42626t();
                    this.f61240b = false;
                }
                C25815g.m49886a((C25815g) this.f61239a, i, (C25807c) aVar.mo42629w());
                return this;
            }

            /* renamed from: a */
            public final C25816a mo42099a(int i, C25824k kVar) {
                if (this.f61240b) {
                    mo42626t();
                    this.f61240b = false;
                }
                C25815g.m49887a((C25815g) this.f61239a, i, kVar);
                return this;
            }
        }

        /* renamed from: c */
        public static C25816a m49893c() {
            return (C25816a) zzaw.mo42619j();
        }

        /* renamed from: d */
        private final void m49895d() {
            AbstractC25995gs<C25807c> gsVar = this.zzf;
            if (!gsVar.mo42366a()) {
                this.zzf = AbstractC25981gj.m50557a(gsVar);
            }
        }

        /* renamed from: e */
        private final void m49897e() {
            AbstractC25995gs<C25824k> gsVar = this.zzg;
            if (!gsVar.mo42366a()) {
                this.zzg = AbstractC25981gj.m50557a(gsVar);
            }
        }

        static {
            Covode.recordClassIndex(31230);
            C25815g gVar = new C25815g();
            zzaw = gVar;
            AbstractC25981gj.m50560a(C25815g.class, gVar);
        }

        private C25815g() {
        }

        /* renamed from: b */
        public final boolean mo42096b() {
            if ((this.zzd & 2) != 0) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        public final boolean mo42095a() {
            if ((this.zzc & 8) != 0) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.measurement.AbstractC25981gj
        /* renamed from: a */
        public final Object mo42005a(int i) {
            MethodCollector.m26663i(8201);
            switch (C25801au.f60923a[i - 1]) {
                case 1:
                    C25815g gVar = new C25815g();
                    MethodCollector.m26664o(8201);
                    return gVar;
                case 2:
                    C25816a aVar = new C25816a((byte) 0);
                    MethodCollector.m26664o(8201);
                    return aVar;
                case 3:
                    Object a = m50558a(zzaw, "\u0001,\u0000\u0002\u00014,\u0000\u0004\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဂ\u0001\u0005ဂ\u0002\u0006ဂ\u0003\u0007ဂ\u0005\bဈ\u0006\tဈ\u0007\nဈ\b\u000bဈ\t\fင\n\rဈ\u000b\u000eဈ\f\u0010ဈ\r\u0011ဂ\u000e\u0012ဂ\u000f\u0013ဈ\u0010\u0014ဇ\u0011\u0015ဈ\u0012\u0016ဂ\u0013\u0017င\u0014\u0018ဈ\u0015\u0019ဈ\u0016\u001aဂ\u0004\u001cဇ\u0017\u001d\u001b\u001eဈ\u0018\u001fင\u0019 င\u001a!င\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဈ\u001f&ဈ 'င!)ဈ\",ဉ#-\u001d.ဂ$/ဂ%2ဈ&4ဈ'", new Object[]{"zzc", "zzd", "zze", "zzf", C25807c.class, "zzg", C25824k.class, "zzh", "zzi", "zzj", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzaa", "zzab", "zzac", "zzk", "zzad", "zzae", C25803a.class, "zzaf", "zzag", "zzah", "zzai", "zzaj", "zzak", "zzal", "zzam", "zzan", "zzao", "zzap", "zzaq", "zzar", "zzas", "zzat", "zzau", "zzav"});
                    MethodCollector.m26664o(8201);
                    return a;
                case 4:
                    C25815g gVar2 = zzaw;
                    MethodCollector.m26664o(8201);
                    return gVar2;
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                    AbstractC26034id<C25815g> idVar = zzax;
                    if (idVar == null) {
                        synchronized (C25815g.class) {
                            try {
                                idVar = zzax;
                                if (idVar == null) {
                                    idVar = new AbstractC25981gj.C25984c<>(zzaw);
                                    zzax = idVar;
                                }
                            } finally {
                                MethodCollector.m26664o(8201);
                            }
                        }
                    }
                    return idVar;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                    MethodCollector.m26664o(8201);
                    return (byte) 1;
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                    MethodCollector.m26664o(8201);
                    return null;
                default:
                    UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
                    MethodCollector.m26664o(8201);
                    throw unsupportedOperationException;
            }
        }

        /* renamed from: a */
        static /* synthetic */ void m49885a(C25815g gVar, int i) {
            gVar.m49895d();
            gVar.zzf.remove(i);
        }

        /* renamed from: b */
        static /* synthetic */ void m49891b(C25815g gVar, int i) {
            gVar.m49897e();
            gVar.zzg.remove(i);
        }

        /* renamed from: b */
        static /* synthetic */ void m49892b(C25815g gVar, Iterable iterable) {
            gVar.m49897e();
            AbstractC25931es.m50179a(iterable, gVar.zzg);
        }

        /* renamed from: c */
        static /* synthetic */ void m49894c(C25815g gVar, Iterable iterable) {
            AbstractC25995gs<C25803a> gsVar = gVar.zzae;
            if (!gsVar.mo42366a()) {
                gVar.zzae = AbstractC25981gj.m50557a(gsVar);
            }
            AbstractC25931es.m50179a(iterable, gVar.zzae);
        }

        /* renamed from: d */
        static /* synthetic */ void m49896d(C25815g gVar, Iterable iterable) {
            int i;
            AbstractC25993gq gqVar = gVar.zzar;
            if (!gqVar.mo42366a()) {
                int size = gqVar.size();
                if (size == 0) {
                    i = 10;
                } else {
                    i = size << 1;
                }
                gVar.zzar = gqVar.mo42631b(i);
            }
            AbstractC25931es.m50179a(iterable, gVar.zzar);
        }

        /* renamed from: a */
        static /* synthetic */ void m49888a(C25815g gVar, C25807c cVar) {
            cVar.getClass();
            gVar.m49895d();
            gVar.zzf.add(cVar);
        }

        /* renamed from: a */
        static /* synthetic */ void m49889a(C25815g gVar, C25824k kVar) {
            kVar.getClass();
            gVar.m49897e();
            gVar.zzg.add(kVar);
        }

        /* renamed from: a */
        static /* synthetic */ void m49890a(C25815g gVar, Iterable iterable) {
            gVar.m49895d();
            AbstractC25931es.m50179a(iterable, gVar.zzf);
        }

        /* renamed from: a */
        static /* synthetic */ void m49886a(C25815g gVar, int i, C25807c cVar) {
            cVar.getClass();
            gVar.m49895d();
            gVar.zzf.set(i, cVar);
        }

        /* renamed from: a */
        static /* synthetic */ void m49887a(C25815g gVar, int i, C25824k kVar) {
            kVar.getClass();
            gVar.m49897e();
            gVar.zzg.set(i, kVar);
        }
    }

    /* renamed from: com.google.android.gms.internal.measurement.av$d */
    public static final class C25809d extends AbstractC25981gj<C25809d, C25810a> {
        static final C25809d zzf;
        private static volatile AbstractC26034id<C25809d> zzg;
        int zzc;
        String zzd = "";
        long zze;

        /* renamed from: com.google.android.gms.internal.measurement.av$d$a */
        public static final class C25810a extends AbstractC25981gj.AbstractC25982a<C25809d, C25810a> {
            static {
                Covode.recordClassIndex(31225);
            }

            private C25810a() {
                super(C25809d.zzf);
            }

            /* synthetic */ C25810a(byte b) {
                this();
            }

            /* renamed from: a */
            public final C25810a mo42080a(long j) {
                if (this.f61240b) {
                    mo42626t();
                    this.f61240b = false;
                }
                C25809d dVar = (C25809d) this.f61239a;
                dVar.zzc |= 2;
                dVar.zze = j;
                return this;
            }

            /* renamed from: a */
            public final C25810a mo42018a(String str) {
                if (this.f61240b) {
                    mo42626t();
                    this.f61240b = false;
                }
                C25809d dVar = (C25809d) this.f61239a;
                str.getClass();
                dVar.zzc |= 1;
                dVar.zzd = str;
                return this;
            }
        }

        private C25809d() {
        }

        /* renamed from: a */
        public static C25810a m49856a() {
            return (C25810a) zzf.mo42619j();
        }

        static {
            Covode.recordClassIndex(31224);
            C25809d dVar = new C25809d();
            zzf = dVar;
            AbstractC25981gj.m50560a(C25809d.class, dVar);
        }

        /* access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.measurement.AbstractC25981gj
        /* renamed from: a */
        public final Object mo42005a(int i) {
            MethodCollector.m26663i(7242);
            switch (C25801au.f60923a[i - 1]) {
                case 1:
                    C25809d dVar = new C25809d();
                    MethodCollector.m26664o(7242);
                    return dVar;
                case 2:
                    C25810a aVar = new C25810a((byte) 0);
                    MethodCollector.m26664o(7242);
                    return aVar;
                case 3:
                    Object a = m50558a(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"zzc", "zzd", "zze"});
                    MethodCollector.m26664o(7242);
                    return a;
                case 4:
                    C25809d dVar2 = zzf;
                    MethodCollector.m26664o(7242);
                    return dVar2;
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                    AbstractC26034id<C25809d> idVar = zzg;
                    if (idVar == null) {
                        synchronized (C25809d.class) {
                            try {
                                idVar = zzg;
                                if (idVar == null) {
                                    idVar = new AbstractC25981gj.C25984c<>(zzf);
                                    zzg = idVar;
                                }
                            } finally {
                                MethodCollector.m26664o(7242);
                            }
                        }
                    }
                    return idVar;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                    MethodCollector.m26664o(7242);
                    return (byte) 1;
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                    MethodCollector.m26664o(7242);
                    return null;
                default:
                    UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
                    MethodCollector.m26664o(7242);
                    throw unsupportedOperationException;
            }
        }
    }

    /* renamed from: com.google.android.gms.internal.measurement.av$e */
    public static final class C25811e extends AbstractC25981gj<C25811e, C25812a> {
        static final C25811e zzj;
        private static volatile AbstractC26034id<C25811e> zzk;
        public int zzc;
        public String zzd = "";
        public String zze = "";
        public long zzf;
        public float zzg;
        public double zzh;
        public AbstractC25995gs<C25811e> zzi = C26035ie.f61328a;

        /* renamed from: com.google.android.gms.internal.measurement.av$e$a */
        public static final class C25812a extends AbstractC25981gj.AbstractC25982a<C25811e, C25812a> {
            static {
                Covode.recordClassIndex(31227);
            }

            private C25812a() {
                super(C25811e.zzj);
            }

            /* renamed from: d */
            public final int mo42092d() {
                return ((C25811e) this.f61239a).mo42084d();
            }

            /* Return type fixed from 'com.google.android.gms.internal.measurement.av$e$a' to match base method */
            @Override // com.google.android.gms.internal.measurement.AbstractC25981gj.AbstractC25982a
            /* renamed from: a */
            public final C25811e mo42007a() {
                if (this.f61240b) {
                    mo42626t();
                    this.f61240b = false;
                }
                C25811e eVar = (C25811e) this.f61239a;
                eVar.zzc &= -3;
                eVar.zze = C25811e.zzj.zze;
                return this;
            }

            /* renamed from: b */
            public final C25812a mo42089b() {
                if (this.f61240b) {
                    mo42626t();
                    this.f61240b = false;
                }
                C25811e eVar = (C25811e) this.f61239a;
                eVar.zzc &= -5;
                eVar.zzf = 0;
                return this;
            }

            /* renamed from: c */
            public final C25812a mo42091c() {
                if (this.f61240b) {
                    mo42626t();
                    this.f61240b = false;
                }
                C25811e eVar = (C25811e) this.f61239a;
                eVar.zzc &= -17;
                eVar.zzh = 0.0d;
                return this;
            }

            /* renamed from: e */
            public final C25812a mo42093e() {
                if (this.f61240b) {
                    mo42626t();
                    this.f61240b = false;
                }
                ((C25811e) this.f61239a).zzi = C26035ie.f61328a;
                return this;
            }

            /* synthetic */ C25812a(byte b) {
                this();
            }

            /* renamed from: a */
            public final C25812a mo42085a(double d) {
                if (this.f61240b) {
                    mo42626t();
                    this.f61240b = false;
                }
                C25811e eVar = (C25811e) this.f61239a;
                eVar.zzc |= 16;
                eVar.zzh = d;
                return this;
            }

            /* renamed from: b */
            public final C25812a mo42090b(String str) {
                if (this.f61240b) {
                    mo42626t();
                    this.f61240b = false;
                }
                C25811e eVar = (C25811e) this.f61239a;
                str.getClass();
                eVar.zzc |= 2;
                eVar.zze = str;
                return this;
            }

            /* renamed from: a */
            public final C25812a mo42086a(long j) {
                if (this.f61240b) {
                    mo42626t();
                    this.f61240b = false;
                }
                C25811e eVar = (C25811e) this.f61239a;
                eVar.zzc |= 4;
                eVar.zzf = j;
                return this;
            }

            /* renamed from: a */
            public final C25812a mo42087a(C25812a aVar) {
                if (this.f61240b) {
                    mo42626t();
                    this.f61240b = false;
                }
                C25811e.m49860a((C25811e) this.f61239a, (C25811e) aVar.mo42629w());
                return this;
            }

            /* renamed from: a */
            public final C25812a mo42088a(Iterable<? extends C25811e> iterable) {
                if (this.f61240b) {
                    mo42626t();
                    this.f61240b = false;
                }
                C25811e.m49861a((C25811e) this.f61239a, iterable);
                return this;
            }

            /* renamed from: a */
            public final C25812a mo42018a(String str) {
                if (this.f61240b) {
                    mo42626t();
                    this.f61240b = false;
                }
                C25811e eVar = (C25811e) this.f61239a;
                str.getClass();
                eVar.zzc |= 1;
                eVar.zzd = str;
                return this;
            }
        }

        /* renamed from: d */
        public final int mo42084d() {
            return this.zzi.size();
        }

        private C25811e() {
        }

        /* renamed from: e */
        public static C25812a m49862e() {
            return (C25812a) zzj.mo42619j();
        }

        /* renamed from: f */
        private final void m49863f() {
            AbstractC25995gs<C25811e> gsVar = this.zzi;
            if (!gsVar.mo42366a()) {
                this.zzi = AbstractC25981gj.m50557a(gsVar);
            }
        }

        /* renamed from: b */
        public final boolean mo42082b() {
            if ((this.zzc & 4) != 0) {
                return true;
            }
            return false;
        }

        /* renamed from: c */
        public final boolean mo42083c() {
            if ((this.zzc & 16) != 0) {
                return true;
            }
            return false;
        }

        static {
            Covode.recordClassIndex(31226);
            C25811e eVar = new C25811e();
            zzj = eVar;
            AbstractC25981gj.m50560a(C25811e.class, eVar);
        }

        /* renamed from: a */
        public final boolean mo42081a() {
            if ((this.zzc & 2) != 0) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.measurement.AbstractC25981gj
        /* renamed from: a */
        public final Object mo42005a(int i) {
            MethodCollector.m26663i(5898);
            switch (C25801au.f60923a[i - 1]) {
                case 1:
                    C25811e eVar = new C25811e();
                    MethodCollector.m26664o(5898);
                    return eVar;
                case 2:
                    C25812a aVar = new C25812a((byte) 0);
                    MethodCollector.m26664o(5898);
                    return aVar;
                case 3:
                    Object a = m50558a(zzj, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001b", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", C25811e.class});
                    MethodCollector.m26664o(5898);
                    return a;
                case 4:
                    C25811e eVar2 = zzj;
                    MethodCollector.m26664o(5898);
                    return eVar2;
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                    AbstractC26034id<C25811e> idVar = zzk;
                    if (idVar == null) {
                        synchronized (C25811e.class) {
                            try {
                                idVar = zzk;
                                if (idVar == null) {
                                    idVar = new AbstractC25981gj.C25984c<>(zzj);
                                    zzk = idVar;
                                }
                            } finally {
                                MethodCollector.m26664o(5898);
                            }
                        }
                    }
                    return idVar;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                    MethodCollector.m26664o(5898);
                    return (byte) 1;
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                    MethodCollector.m26664o(5898);
                    return null;
                default:
                    UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
                    MethodCollector.m26664o(5898);
                    throw unsupportedOperationException;
            }
        }

        /* renamed from: a */
        static /* synthetic */ void m49860a(C25811e eVar, C25811e eVar2) {
            eVar2.getClass();
            eVar.m49863f();
            eVar.zzi.add(eVar2);
        }

        /* renamed from: a */
        static /* synthetic */ void m49861a(C25811e eVar, Iterable iterable) {
            eVar.m49863f();
            AbstractC25931es.m50179a(iterable, eVar.zzi);
        }
    }

    /* renamed from: com.google.android.gms.internal.measurement.av$f */
    public static final class C25813f extends AbstractC25981gj<C25813f, C25814a> {
        static final C25813f zzd;
        private static volatile AbstractC26034id<C25813f> zze;
        public AbstractC25995gs<C25815g> zzc = C26035ie.f61328a;

        /* renamed from: com.google.android.gms.internal.measurement.av$f$a */
        public static final class C25814a extends AbstractC25981gj.AbstractC25982a<C25813f, C25814a> {
            static {
                Covode.recordClassIndex(31229);
            }

            private C25814a() {
                super(C25813f.zzd);
            }

            /* Return type fixed from 'com.google.android.gms.internal.measurement.av$g' to match base method */
            @Override // com.google.android.gms.internal.measurement.AbstractC25981gj.AbstractC25982a
            /* renamed from: a */
            public final C25813f mo42007a() {
                return ((C25813f) this.f61239a).zzc.get(0);
            }

            /* synthetic */ C25814a(byte b) {
                this();
            }

            /* renamed from: a */
            public final C25814a mo42094a(C25815g.C25816a aVar) {
                if (this.f61240b) {
                    mo42626t();
                    this.f61240b = false;
                }
                C25813f.m49881a((C25813f) this.f61239a, (C25815g) aVar.mo42629w());
                return this;
            }
        }

        private C25813f() {
        }

        /* renamed from: a */
        public static C25814a m49880a() {
            return (C25814a) zzd.mo42619j();
        }

        static {
            Covode.recordClassIndex(31228);
            C25813f fVar = new C25813f();
            zzd = fVar;
            AbstractC25981gj.m50560a(C25813f.class, fVar);
        }

        /* access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.measurement.AbstractC25981gj
        /* renamed from: a */
        public final Object mo42005a(int i) {
            MethodCollector.m26663i(7394);
            switch (C25801au.f60923a[i - 1]) {
                case 1:
                    C25813f fVar = new C25813f();
                    MethodCollector.m26664o(7394);
                    return fVar;
                case 2:
                    C25814a aVar = new C25814a((byte) 0);
                    MethodCollector.m26664o(7394);
                    return aVar;
                case 3:
                    Object a = m50558a(zzd, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzc", C25815g.class});
                    MethodCollector.m26664o(7394);
                    return a;
                case 4:
                    C25813f fVar2 = zzd;
                    MethodCollector.m26664o(7394);
                    return fVar2;
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                    AbstractC26034id<C25813f> idVar = zze;
                    if (idVar == null) {
                        synchronized (C25813f.class) {
                            try {
                                idVar = zze;
                                if (idVar == null) {
                                    idVar = new AbstractC25981gj.C25984c<>(zzd);
                                    zze = idVar;
                                }
                            } finally {
                                MethodCollector.m26664o(7394);
                            }
                        }
                    }
                    return idVar;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                    MethodCollector.m26664o(7394);
                    return (byte) 1;
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                    MethodCollector.m26664o(7394);
                    return null;
                default:
                    UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
                    MethodCollector.m26664o(7394);
                    throw unsupportedOperationException;
            }
        }

        /* renamed from: a */
        static /* synthetic */ void m49881a(C25813f fVar, C25815g gVar) {
            gVar.getClass();
            AbstractC25995gs<C25815g> gsVar = fVar.zzc;
            if (!gsVar.mo42366a()) {
                fVar.zzc = AbstractC25981gj.m50557a(gsVar);
            }
            fVar.zzc.add(gVar);
        }
    }

    /* renamed from: com.google.android.gms.internal.measurement.av$i */
    public static final class C25820i extends AbstractC25981gj<C25820i, C25821a> {
        public static final C25820i zzg;
        private static volatile AbstractC26034id<C25820i> zzh;
        public AbstractC25992gp zzc = C26007hd.f61283a;
        public AbstractC25992gp zzd = C26007hd.f61283a;
        public AbstractC25995gs<C25805b> zze = C26035ie.f61328a;
        public AbstractC25995gs<C25822j> zzf = C26035ie.f61328a;

        /* renamed from: com.google.android.gms.internal.measurement.av$i$a */
        public static final class C25821a extends AbstractC25981gj.AbstractC25982a<C25820i, C25821a> {
            static {
                Covode.recordClassIndex(31236);
            }

            private C25821a() {
                super(C25820i.zzg);
            }

            /* Return type fixed from 'com.google.android.gms.internal.measurement.av$i$a' to match base method */
            @Override // com.google.android.gms.internal.measurement.AbstractC25981gj.AbstractC25982a
            /* renamed from: a */
            public final C25820i mo42007a() {
                if (this.f61240b) {
                    mo42626t();
                    this.f61240b = false;
                }
                ((C25820i) this.f61239a).zzc = C26007hd.f61283a;
                return this;
            }

            /* renamed from: b */
            public final C25821a mo42166b() {
                if (this.f61240b) {
                    mo42626t();
                    this.f61240b = false;
                }
                ((C25820i) this.f61239a).zzd = C26007hd.f61283a;
                return this;
            }

            /* synthetic */ C25821a(byte b) {
                this();
            }

            /* renamed from: c */
            public final C25821a mo42169c(Iterable<? extends C25805b> iterable) {
                if (this.f61240b) {
                    mo42626t();
                    this.f61240b = false;
                }
                C25820i.m49973c((C25820i) this.f61239a, iterable);
                return this;
            }

            /* renamed from: d */
            public final C25821a mo42170d(Iterable<? extends C25822j> iterable) {
                if (this.f61240b) {
                    mo42626t();
                    this.f61240b = false;
                }
                C25820i.m49975d((C25820i) this.f61239a, iterable);
                return this;
            }

            /* renamed from: a */
            public final C25821a mo42164a(int i) {
                if (this.f61240b) {
                    mo42626t();
                    this.f61240b = false;
                }
                C25820i.m49969a((C25820i) this.f61239a, i);
                return this;
            }

            /* renamed from: b */
            public final C25821a mo42167b(int i) {
                if (this.f61240b) {
                    mo42626t();
                    this.f61240b = false;
                }
                C25820i.m49971b((C25820i) this.f61239a, i);
                return this;
            }

            /* renamed from: a */
            public final C25821a mo42165a(Iterable<? extends Long> iterable) {
                if (this.f61240b) {
                    mo42626t();
                    this.f61240b = false;
                }
                C25820i.m49970a((C25820i) this.f61239a, iterable);
                return this;
            }

            /* renamed from: b */
            public final C25821a mo42168b(Iterable<? extends Long> iterable) {
                if (this.f61240b) {
                    mo42626t();
                    this.f61240b = false;
                }
                C25820i.m49972b((C25820i) this.f61239a, iterable);
                return this;
            }
        }

        /* renamed from: a */
        public final int mo42161a() {
            return this.zzc.size();
        }

        /* renamed from: b */
        public final int mo42162b() {
            return this.zze.size();
        }

        /* renamed from: c */
        public final int mo42163c() {
            return this.zzf.size();
        }

        /* renamed from: d */
        public static C25821a m49974d() {
            return (C25821a) zzg.mo42619j();
        }

        /* renamed from: e */
        private final void m49976e() {
            AbstractC25995gs<C25805b> gsVar = this.zze;
            if (!gsVar.mo42366a()) {
                this.zze = AbstractC25981gj.m50557a(gsVar);
            }
        }

        /* renamed from: f */
        private final void m49977f() {
            AbstractC25995gs<C25822j> gsVar = this.zzf;
            if (!gsVar.mo42366a()) {
                this.zzf = AbstractC25981gj.m50557a(gsVar);
            }
        }

        static {
            Covode.recordClassIndex(31235);
            C25820i iVar = new C25820i();
            zzg = iVar;
            AbstractC25981gj.m50560a(C25820i.class, iVar);
        }

        private C25820i() {
        }

        /* access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.measurement.AbstractC25981gj
        /* renamed from: a */
        public final Object mo42005a(int i) {
            MethodCollector.m26663i(6240);
            switch (C25801au.f60923a[i - 1]) {
                case 1:
                    C25820i iVar = new C25820i();
                    MethodCollector.m26664o(6240);
                    return iVar;
                case 2:
                    C25821a aVar = new C25821a((byte) 0);
                    MethodCollector.m26664o(6240);
                    return aVar;
                case 3:
                    Object a = m50558a(zzg, "\u0001\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zzc", "zzd", "zze", C25805b.class, "zzf", C25822j.class});
                    MethodCollector.m26664o(6240);
                    return a;
                case 4:
                    C25820i iVar2 = zzg;
                    MethodCollector.m26664o(6240);
                    return iVar2;
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                    AbstractC26034id<C25820i> idVar = zzh;
                    if (idVar == null) {
                        synchronized (C25820i.class) {
                            try {
                                idVar = zzh;
                                if (idVar == null) {
                                    idVar = new AbstractC25981gj.C25984c<>(zzg);
                                    zzh = idVar;
                                }
                            } finally {
                                MethodCollector.m26664o(6240);
                            }
                        }
                    }
                    return idVar;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                    MethodCollector.m26664o(6240);
                    return (byte) 1;
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                    MethodCollector.m26664o(6240);
                    return null;
                default:
                    UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
                    MethodCollector.m26664o(6240);
                    throw unsupportedOperationException;
            }
        }

        /* renamed from: a */
        static /* synthetic */ void m49969a(C25820i iVar, int i) {
            iVar.m49976e();
            iVar.zze.remove(i);
        }

        /* renamed from: b */
        static /* synthetic */ void m49971b(C25820i iVar, int i) {
            iVar.m49977f();
            iVar.zzf.remove(i);
        }

        /* renamed from: c */
        static /* synthetic */ void m49973c(C25820i iVar, Iterable iterable) {
            iVar.m49976e();
            AbstractC25931es.m50179a(iterable, iVar.zze);
        }

        /* renamed from: a */
        static /* synthetic */ void m49970a(C25820i iVar, Iterable iterable) {
            AbstractC25992gp gpVar = iVar.zzc;
            if (!gpVar.mo42366a()) {
                iVar.zzc = AbstractC25981gj.m50556a(gpVar);
            }
            AbstractC25931es.m50179a(iterable, iVar.zzc);
        }

        /* renamed from: b */
        static /* synthetic */ void m49972b(C25820i iVar, Iterable iterable) {
            AbstractC25992gp gpVar = iVar.zzd;
            if (!gpVar.mo42366a()) {
                iVar.zzd = AbstractC25981gj.m50556a(gpVar);
            }
            AbstractC25931es.m50179a(iterable, iVar.zzd);
        }

        /* renamed from: d */
        static /* synthetic */ void m49975d(C25820i iVar, Iterable iterable) {
            iVar.m49977f();
            AbstractC25931es.m50179a(iterable, iVar.zzf);
        }
    }

    /* renamed from: com.google.android.gms.internal.measurement.av$j */
    public static final class C25822j extends AbstractC25981gj<C25822j, C25823a> {
        static final C25822j zzf;
        private static volatile AbstractC26034id<C25822j> zzg;
        int zzc;
        public int zzd;
        public AbstractC25992gp zze = C26007hd.f61283a;

        /* renamed from: com.google.android.gms.internal.measurement.av$j$a */
        public static final class C25823a extends AbstractC25981gj.AbstractC25982a<C25822j, C25823a> {
            static {
                Covode.recordClassIndex(31238);
            }

            private C25823a() {
                super(C25822j.zzf);
            }

            /* synthetic */ C25823a(byte b) {
                this();
            }

            /* renamed from: a */
            public final C25823a mo42173a(int i) {
                if (this.f61240b) {
                    mo42626t();
                    this.f61240b = false;
                }
                C25822j jVar = (C25822j) this.f61239a;
                jVar.zzc |= 1;
                jVar.zzd = i;
                return this;
            }

            /* renamed from: a */
            public final C25823a mo42174a(Iterable<? extends Long> iterable) {
                if (this.f61240b) {
                    mo42626t();
                    this.f61240b = false;
                }
                C25822j.m49990a((C25822j) this.f61239a, iterable);
                return this;
            }
        }

        private C25822j() {
        }

        /* renamed from: b */
        public final int mo42172b() {
            return this.zze.size();
        }

        /* renamed from: c */
        public static C25823a m49991c() {
            return (C25823a) zzf.mo42619j();
        }

        /* renamed from: a */
        public final boolean mo42171a() {
            if ((this.zzc & 1) != 0) {
                return true;
            }
            return false;
        }

        static {
            Covode.recordClassIndex(31237);
            C25822j jVar = new C25822j();
            zzf = jVar;
            AbstractC25981gj.m50560a(C25822j.class, jVar);
        }

        /* access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.measurement.AbstractC25981gj
        /* renamed from: a */
        public final Object mo42005a(int i) {
            MethodCollector.m26663i(6062);
            switch (C25801au.f60923a[i - 1]) {
                case 1:
                    C25822j jVar = new C25822j();
                    MethodCollector.m26664o(6062);
                    return jVar;
                case 2:
                    C25823a aVar = new C25823a((byte) 0);
                    MethodCollector.m26664o(6062);
                    return aVar;
                case 3:
                    Object a = m50558a(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zzc", "zzd", "zze"});
                    MethodCollector.m26664o(6062);
                    return a;
                case 4:
                    C25822j jVar2 = zzf;
                    MethodCollector.m26664o(6062);
                    return jVar2;
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                    AbstractC26034id<C25822j> idVar = zzg;
                    if (idVar == null) {
                        synchronized (C25822j.class) {
                            try {
                                idVar = zzg;
                                if (idVar == null) {
                                    idVar = new AbstractC25981gj.C25984c<>(zzf);
                                    zzg = idVar;
                                }
                            } finally {
                                MethodCollector.m26664o(6062);
                            }
                        }
                    }
                    return idVar;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                    MethodCollector.m26664o(6062);
                    return (byte) 1;
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                    MethodCollector.m26664o(6062);
                    return null;
                default:
                    UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
                    MethodCollector.m26664o(6062);
                    throw unsupportedOperationException;
            }
        }

        /* renamed from: a */
        static /* synthetic */ void m49990a(C25822j jVar, Iterable iterable) {
            AbstractC25992gp gpVar = jVar.zze;
            if (!gpVar.mo42366a()) {
                jVar.zze = AbstractC25981gj.m50556a(gpVar);
            }
            AbstractC25931es.m50179a(iterable, jVar.zze);
        }
    }

    /* renamed from: com.google.android.gms.internal.measurement.av$k */
    public static final class C25824k extends AbstractC25981gj<C25824k, C25825a> {
        static final C25824k zzj;
        private static volatile AbstractC26034id<C25824k> zzk;
        public int zzc;
        public long zzd;
        public String zze = "";
        public String zzf = "";
        public long zzg;
        private float zzh;
        public double zzi;

        /* renamed from: com.google.android.gms.internal.measurement.av$k$a */
        public static final class C25825a extends AbstractC25981gj.AbstractC25982a<C25824k, C25825a> {
            static {
                Covode.recordClassIndex(31240);
            }

            private C25825a() {
                super(C25824k.zzj);
            }

            /* Return type fixed from 'com.google.android.gms.internal.measurement.av$k$a' to match base method */
            @Override // com.google.android.gms.internal.measurement.AbstractC25981gj.AbstractC25982a
            /* renamed from: a */
            public final C25824k mo42007a() {
                if (this.f61240b) {
                    mo42626t();
                    this.f61240b = false;
                }
                C25824k kVar = (C25824k) this.f61239a;
                kVar.zzc &= -5;
                kVar.zzf = C25824k.zzj.zzf;
                return this;
            }

            /* renamed from: b */
            public final C25825a mo42180b() {
                if (this.f61240b) {
                    mo42626t();
                    this.f61240b = false;
                }
                C25824k kVar = (C25824k) this.f61239a;
                kVar.zzc &= -9;
                kVar.zzg = 0;
                return this;
            }

            /* renamed from: c */
            public final C25825a mo42183c() {
                if (this.f61240b) {
                    mo42626t();
                    this.f61240b = false;
                }
                C25824k kVar = (C25824k) this.f61239a;
                kVar.zzc &= -33;
                kVar.zzi = 0.0d;
                return this;
            }

            /* synthetic */ C25825a(byte b) {
                this();
            }

            /* renamed from: a */
            public final C25825a mo42178a(double d) {
                if (this.f61240b) {
                    mo42626t();
                    this.f61240b = false;
                }
                C25824k kVar = (C25824k) this.f61239a;
                kVar.zzc |= 32;
                kVar.zzi = d;
                return this;
            }

            /* renamed from: b */
            public final C25825a mo42181b(long j) {
                if (this.f61240b) {
                    mo42626t();
                    this.f61240b = false;
                }
                C25824k kVar = (C25824k) this.f61239a;
                kVar.zzc |= 8;
                kVar.zzg = j;
                return this;
            }

            /* renamed from: a */
            public final C25825a mo42179a(long j) {
                if (this.f61240b) {
                    mo42626t();
                    this.f61240b = false;
                }
                C25824k kVar = (C25824k) this.f61239a;
                kVar.zzc |= 1;
                kVar.zzd = j;
                return this;
            }

            /* renamed from: b */
            public final C25825a mo42182b(String str) {
                if (this.f61240b) {
                    mo42626t();
                    this.f61240b = false;
                }
                C25824k kVar = (C25824k) this.f61239a;
                str.getClass();
                kVar.zzc |= 4;
                kVar.zzf = str;
                return this;
            }

            /* renamed from: a */
            public final C25825a mo42018a(String str) {
                if (this.f61240b) {
                    mo42626t();
                    this.f61240b = false;
                }
                C25824k kVar = (C25824k) this.f61239a;
                str.getClass();
                kVar.zzc |= 2;
                kVar.zze = str;
                return this;
            }
        }

        private C25824k() {
        }

        /* renamed from: d */
        public static C25825a m49997d() {
            return (C25825a) zzj.mo42619j();
        }

        /* renamed from: a */
        public final boolean mo42175a() {
            if ((this.zzc & 1) != 0) {
                return true;
            }
            return false;
        }

        /* renamed from: b */
        public final boolean mo42176b() {
            if ((this.zzc & 8) != 0) {
                return true;
            }
            return false;
        }

        /* renamed from: c */
        public final boolean mo42177c() {
            if ((this.zzc & 32) != 0) {
                return true;
            }
            return false;
        }

        static {
            Covode.recordClassIndex(31239);
            C25824k kVar = new C25824k();
            zzj = kVar;
            AbstractC25981gj.m50560a(C25824k.class, kVar);
        }

        /* access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.measurement.AbstractC25981gj
        /* renamed from: a */
        public final Object mo42005a(int i) {
            MethodCollector.m26663i(6610);
            switch (C25801au.f60923a[i - 1]) {
                case 1:
                    C25824k kVar = new C25824k();
                    MethodCollector.m26664o(6610);
                    return kVar;
                case 2:
                    C25825a aVar = new C25825a((byte) 0);
                    MethodCollector.m26664o(6610);
                    return aVar;
                case 3:
                    Object a = m50558a(zzj, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ခ\u0004\u0006က\u0005", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
                    MethodCollector.m26664o(6610);
                    return a;
                case 4:
                    C25824k kVar2 = zzj;
                    MethodCollector.m26664o(6610);
                    return kVar2;
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                    AbstractC26034id<C25824k> idVar = zzk;
                    if (idVar == null) {
                        synchronized (C25824k.class) {
                            try {
                                idVar = zzk;
                                if (idVar == null) {
                                    idVar = new AbstractC25981gj.C25984c<>(zzj);
                                    zzk = idVar;
                                }
                            } finally {
                                MethodCollector.m26664o(6610);
                            }
                        }
                    }
                    return idVar;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                    MethodCollector.m26664o(6610);
                    return (byte) 1;
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                    MethodCollector.m26664o(6610);
                    return null;
                default:
                    UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
                    MethodCollector.m26664o(6610);
                    throw unsupportedOperationException;
            }
        }
    }
}

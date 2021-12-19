package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.android.gms.internal.measurement.AbstractC25981gj;

/* renamed from: com.google.android.gms.internal.measurement.am */
public final class C25773am {

    /* renamed from: com.google.android.gms.internal.measurement.am$d */
    public static final class C25780d extends AbstractC25981gj<C25780d, C25781a> {
        static final C25780d zzi;
        private static volatile AbstractC26034id<C25780d> zzj;
        private int zzc;
        private int zzd;
        public boolean zze;
        public String zzf = "";
        public String zzg = "";
        public String zzh = "";

        /* renamed from: com.google.android.gms.internal.measurement.am$d$b */
        public enum EnumC25782b implements AbstractC25988gl {
            UNKNOWN_COMPARISON_TYPE(0),
            LESS_THAN(1),
            GREATER_THAN(2),
            EQUAL(3),
            BETWEEN(4);
            

            /* renamed from: a */
            private static final AbstractC25991go<EnumC25782b> f60914a = new C25788an();

            /* renamed from: b */
            private final int f60916b;

            public static AbstractC25990gn zzb() {
                return C25789ao.f60920a;
            }

            @Override // com.google.android.gms.internal.measurement.AbstractC25988gl
            public final int zza() {
                return this.f60916b;
            }

            static {
                Covode.recordClassIndex(31197);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("<");
                sb.append(getClass().getName()).append('@').append(Integer.toHexString(System.identityHashCode(this)));
                sb.append(" number=").append(this.f60916b);
                return sb.append(" name=").append(name()).append('>').toString();
            }

            public static EnumC25782b zza(int i) {
                if (i == 0) {
                    return UNKNOWN_COMPARISON_TYPE;
                }
                if (i == 1) {
                    return LESS_THAN;
                }
                if (i == 2) {
                    return GREATER_THAN;
                }
                if (i == 3) {
                    return EQUAL;
                }
                if (i != 4) {
                    return null;
                }
                return BETWEEN;
            }

            private EnumC25782b(int i) {
                this.f60916b = i;
            }
        }

        /* renamed from: com.google.android.gms.internal.measurement.am$d$a */
        public static final class C25781a extends AbstractC25981gj.AbstractC25982a<C25780d, C25781a> {
            static {
                Covode.recordClassIndex(31196);
            }

            private C25781a() {
                super(C25780d.zzi);
            }

            /* synthetic */ C25781a(byte b) {
                this();
            }
        }

        private C25780d() {
        }

        /* renamed from: a */
        public final boolean mo42026a() {
            if ((this.zzc & 1) != 0) {
                return true;
            }
            return false;
        }

        /* renamed from: b */
        public final EnumC25782b mo42027b() {
            EnumC25782b zza = EnumC25782b.zza(this.zzd);
            if (zza == null) {
                return EnumC25782b.UNKNOWN_COMPARISON_TYPE;
            }
            return zza;
        }

        /* renamed from: c */
        public final boolean mo42028c() {
            if ((this.zzc & 2) != 0) {
                return true;
            }
            return false;
        }

        /* renamed from: d */
        public final boolean mo42029d() {
            if ((this.zzc & 4) != 0) {
                return true;
            }
            return false;
        }

        /* renamed from: e */
        public final boolean mo42030e() {
            if ((this.zzc & 8) != 0) {
                return true;
            }
            return false;
        }

        /* renamed from: f */
        public final boolean mo42031f() {
            if ((this.zzc & 16) != 0) {
                return true;
            }
            return false;
        }

        static {
            Covode.recordClassIndex(31195);
            C25780d dVar = new C25780d();
            zzi = dVar;
            AbstractC25981gj.m50560a(C25780d.class, dVar);
        }

        /* access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.measurement.AbstractC25981gj
        /* renamed from: a */
        public final Object mo42005a(int i) {
            MethodCollector.m26663i(6860);
            switch (C25772al.f60913a[i - 1]) {
                case 1:
                    C25780d dVar = new C25780d();
                    MethodCollector.m26664o(6860);
                    return dVar;
                case 2:
                    C25781a aVar = new C25781a((byte) 0);
                    MethodCollector.m26664o(6860);
                    return aVar;
                case 3:
                    Object a = m50558a(zzi, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"zzc", "zzd", EnumC25782b.zzb(), "zze", "zzf", "zzg", "zzh"});
                    MethodCollector.m26664o(6860);
                    return a;
                case 4:
                    C25780d dVar2 = zzi;
                    MethodCollector.m26664o(6860);
                    return dVar2;
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                    AbstractC26034id<C25780d> idVar = zzj;
                    if (idVar == null) {
                        synchronized (C25780d.class) {
                            try {
                                idVar = zzj;
                                if (idVar == null) {
                                    idVar = new AbstractC25981gj.C25984c<>(zzi);
                                    zzj = idVar;
                                }
                            } finally {
                                MethodCollector.m26664o(6860);
                            }
                        }
                    }
                    return idVar;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                    MethodCollector.m26664o(6860);
                    return (byte) 1;
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                    MethodCollector.m26664o(6860);
                    return null;
                default:
                    UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
                    MethodCollector.m26664o(6860);
                    throw unsupportedOperationException;
            }
        }
    }

    /* renamed from: com.google.android.gms.internal.measurement.am$f */
    public static final class C25785f extends AbstractC25981gj<C25785f, C25787b> {
        static final C25785f zzh;
        private static volatile AbstractC26034id<C25785f> zzi;
        public int zzc;
        private int zzd;
        public String zze = "";
        public boolean zzf;
        public AbstractC25995gs<String> zzg = C26035ie.f61328a;

        /* renamed from: com.google.android.gms.internal.measurement.am$f$a */
        public enum EnumC25786a implements AbstractC25988gl {
            UNKNOWN_MATCH_TYPE(0),
            REGEXP(1),
            BEGINS_WITH(2),
            ENDS_WITH(3),
            PARTIAL(4),
            EXACT(5),
            IN_LIST(6);
            

            /* renamed from: a */
            private static final AbstractC25991go<EnumC25786a> f60917a = new C25791aq();

            /* renamed from: b */
            private final int f60919b;

            public static AbstractC25990gn zzb() {
                return C25790ap.f60921a;
            }

            @Override // com.google.android.gms.internal.measurement.AbstractC25988gl
            public final int zza() {
                return this.f60919b;
            }

            static {
                Covode.recordClassIndex(31201);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("<");
                sb.append(getClass().getName()).append('@').append(Integer.toHexString(System.identityHashCode(this)));
                sb.append(" number=").append(this.f60919b);
                return sb.append(" name=").append(name()).append('>').toString();
            }

            public static EnumC25786a zza(int i) {
                switch (i) {
                    case 0:
                        return UNKNOWN_MATCH_TYPE;
                    case 1:
                        return REGEXP;
                    case 2:
                        return BEGINS_WITH;
                    case 3:
                        return ENDS_WITH;
                    case 4:
                        return PARTIAL;
                    case ABRConfig.ABR_STARTUP_MODEL_KEY:
                        return EXACT;
                    case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                        return IN_LIST;
                    default:
                        return null;
                }
            }

            private EnumC25786a(int i) {
                this.f60919b = i;
            }
        }

        /* renamed from: com.google.android.gms.internal.measurement.am$f$b */
        public static final class C25787b extends AbstractC25981gj.AbstractC25982a<C25785f, C25787b> {
            static {
                Covode.recordClassIndex(31202);
            }

            private C25787b() {
                super(C25785f.zzh);
            }

            /* synthetic */ C25787b(byte b) {
                this();
            }
        }

        /* renamed from: d */
        public final int mo42039d() {
            return this.zzg.size();
        }

        private C25785f() {
        }

        /* renamed from: a */
        public final boolean mo42036a() {
            if ((this.zzc & 1) != 0) {
                return true;
            }
            return false;
        }

        /* renamed from: b */
        public final EnumC25786a mo42037b() {
            EnumC25786a zza = EnumC25786a.zza(this.zzd);
            if (zza == null) {
                return EnumC25786a.UNKNOWN_MATCH_TYPE;
            }
            return zza;
        }

        /* renamed from: c */
        public final boolean mo42038c() {
            if ((this.zzc & 2) != 0) {
                return true;
            }
            return false;
        }

        static {
            Covode.recordClassIndex(31200);
            C25785f fVar = new C25785f();
            zzh = fVar;
            AbstractC25981gj.m50560a(C25785f.class, fVar);
        }

        /* access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.measurement.AbstractC25981gj
        /* renamed from: a */
        public final Object mo42005a(int i) {
            MethodCollector.m26663i(7793);
            switch (C25772al.f60913a[i - 1]) {
                case 1:
                    C25785f fVar = new C25785f();
                    MethodCollector.m26664o(7793);
                    return fVar;
                case 2:
                    C25787b bVar = new C25787b((byte) 0);
                    MethodCollector.m26664o(7793);
                    return bVar;
                case 3:
                    Object a = m50558a(zzh, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"zzc", "zzd", EnumC25786a.zzb(), "zze", "zzf", "zzg"});
                    MethodCollector.m26664o(7793);
                    return a;
                case 4:
                    C25785f fVar2 = zzh;
                    MethodCollector.m26664o(7793);
                    return fVar2;
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                    AbstractC26034id<C25785f> idVar = zzi;
                    if (idVar == null) {
                        synchronized (C25785f.class) {
                            try {
                                idVar = zzi;
                                if (idVar == null) {
                                    idVar = new AbstractC25981gj.C25984c<>(zzh);
                                    zzi = idVar;
                                }
                            } finally {
                                MethodCollector.m26664o(7793);
                            }
                        }
                    }
                    return idVar;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                    MethodCollector.m26664o(7793);
                    return (byte) 1;
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                    MethodCollector.m26664o(7793);
                    return null;
                default:
                    UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
                    MethodCollector.m26664o(7793);
                    throw unsupportedOperationException;
            }
        }
    }

    static {
        Covode.recordClassIndex(31188);
    }

    /* renamed from: com.google.android.gms.internal.measurement.am$a */
    public static final class C25774a extends AbstractC25981gj<C25774a, C25775a> {
        static final C25774a zzi;
        private static volatile AbstractC26034id<C25774a> zzj;
        private int zzc;
        public int zzd;
        public AbstractC25995gs<C25783e> zze = C26035ie.f61328a;
        public AbstractC25995gs<C25776b> zzf = C26035ie.f61328a;
        private boolean zzg;
        private boolean zzh;

        /* renamed from: com.google.android.gms.internal.measurement.am$a$a */
        public static final class C25775a extends AbstractC25981gj.AbstractC25982a<C25774a, C25775a> {
            static {
                Covode.recordClassIndex(31190);
            }

            private C25775a() {
                super(C25774a.zzi);
            }

            /* renamed from: a */
            public final int mo42007a() {
                return ((C25774a) this.f61239a).zze.size();
            }

            /* renamed from: b */
            public final int mo42011b() {
                return ((C25774a) this.f61239a).zzf.size();
            }

            /* synthetic */ C25775a(byte b) {
                this();
            }

            /* renamed from: b */
            public final C25776b mo42012b(int i) {
                return ((C25774a) this.f61239a).zzf.get(i);
            }

            /* renamed from: a */
            public final C25783e mo42010a(int i) {
                return ((C25774a) this.f61239a).zze.get(i);
            }

            /* renamed from: a */
            public final C25775a mo42008a(int i, C25776b.C25777a aVar) {
                if (this.f61240b) {
                    mo42626t();
                    this.f61240b = false;
                }
                C25774a.m49751a((C25774a) this.f61239a, i, (C25776b) aVar.mo42629w());
                return this;
            }

            /* renamed from: a */
            public final C25775a mo42009a(int i, C25783e.C25784a aVar) {
                if (this.f61240b) {
                    mo42626t();
                    this.f61240b = false;
                }
                C25774a.m49752a((C25774a) this.f61239a, i, (C25783e) aVar.mo42629w());
                return this;
            }
        }

        private C25774a() {
        }

        /* renamed from: a */
        public final boolean mo42006a() {
            if ((this.zzc & 1) != 0) {
                return true;
            }
            return false;
        }

        static {
            Covode.recordClassIndex(31189);
            C25774a aVar = new C25774a();
            zzi = aVar;
            AbstractC25981gj.m50560a(C25774a.class, aVar);
        }

        /* access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.measurement.AbstractC25981gj
        /* renamed from: a */
        public final Object mo42005a(int i) {
            MethodCollector.m26663i(6050);
            switch (C25772al.f60913a[i - 1]) {
                case 1:
                    C25774a aVar = new C25774a();
                    MethodCollector.m26664o(6050);
                    return aVar;
                case 2:
                    C25775a aVar2 = new C25775a((byte) 0);
                    MethodCollector.m26664o(6050);
                    return aVar2;
                case 3:
                    Object a = m50558a(zzi, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zzc", "zzd", "zze", C25783e.class, "zzf", C25776b.class, "zzg", "zzh"});
                    MethodCollector.m26664o(6050);
                    return a;
                case 4:
                    C25774a aVar3 = zzi;
                    MethodCollector.m26664o(6050);
                    return aVar3;
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                    AbstractC26034id<C25774a> idVar = zzj;
                    if (idVar == null) {
                        synchronized (C25774a.class) {
                            try {
                                idVar = zzj;
                                if (idVar == null) {
                                    idVar = new AbstractC25981gj.C25984c<>(zzi);
                                    zzj = idVar;
                                }
                            } finally {
                                MethodCollector.m26664o(6050);
                            }
                        }
                    }
                    return idVar;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                    MethodCollector.m26664o(6050);
                    return (byte) 1;
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                    MethodCollector.m26664o(6050);
                    return null;
                default:
                    UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
                    MethodCollector.m26664o(6050);
                    throw unsupportedOperationException;
            }
        }

        /* renamed from: a */
        static /* synthetic */ void m49751a(C25774a aVar, int i, C25776b bVar) {
            bVar.getClass();
            AbstractC25995gs<C25776b> gsVar = aVar.zzf;
            if (!gsVar.mo42366a()) {
                aVar.zzf = AbstractC25981gj.m50557a(gsVar);
            }
            aVar.zzf.set(i, bVar);
        }

        /* renamed from: a */
        static /* synthetic */ void m49752a(C25774a aVar, int i, C25783e eVar) {
            eVar.getClass();
            AbstractC25995gs<C25783e> gsVar = aVar.zze;
            if (!gsVar.mo42366a()) {
                aVar.zze = AbstractC25981gj.m50557a(gsVar);
            }
            aVar.zze.set(i, eVar);
        }
    }

    /* renamed from: com.google.android.gms.internal.measurement.am$b */
    public static final class C25776b extends AbstractC25981gj<C25776b, C25777a> {
        static final C25776b zzl;
        private static volatile AbstractC26034id<C25776b> zzm;
        public int zzc;
        public int zzd;
        public String zze = "";
        public AbstractC25995gs<C25778c> zzf = C26035ie.f61328a;
        private boolean zzg;
        private C25780d zzh;
        public boolean zzi;
        public boolean zzj;
        public boolean zzk;

        /* renamed from: com.google.android.gms.internal.measurement.am$b$a */
        public static final class C25777a extends AbstractC25981gj.AbstractC25982a<C25776b, C25777a> {
            static {
                Covode.recordClassIndex(31192);
            }

            private C25777a() {
                super(C25776b.zzl);
            }

            /* renamed from: a */
            public final String mo42007a() {
                return ((C25776b) this.f61239a).zze;
            }

            /* renamed from: b */
            public final int mo42020b() {
                return ((C25776b) this.f61239a).mo42014b();
            }

            /* synthetic */ C25777a(byte b) {
                this();
            }

            /* renamed from: a */
            public final C25778c mo42019a(int i) {
                return ((C25776b) this.f61239a).zzf.get(i);
            }

            /* renamed from: a */
            public final C25777a mo42018a(String str) {
                if (this.f61240b) {
                    mo42626t();
                    this.f61240b = false;
                }
                C25776b bVar = (C25776b) this.f61239a;
                str.getClass();
                bVar.zzc |= 2;
                bVar.zze = str;
                return this;
            }

            /* renamed from: a */
            public final C25777a mo42017a(int i, C25778c cVar) {
                if (this.f61240b) {
                    mo42626t();
                    this.f61240b = false;
                }
                C25776b.m49761a((C25776b) this.f61239a, i, cVar);
                return this;
            }
        }

        /* renamed from: b */
        public final int mo42014b() {
            return this.zzf.size();
        }

        /* renamed from: d */
        public final C25780d mo42016d() {
            C25780d dVar = this.zzh;
            if (dVar == null) {
                return C25780d.zzi;
            }
            return dVar;
        }

        private C25776b() {
        }

        /* renamed from: e */
        public static C25777a m49762e() {
            return (C25777a) zzl.mo42619j();
        }

        /* renamed from: a */
        public final boolean mo42013a() {
            if ((this.zzc & 1) != 0) {
                return true;
            }
            return false;
        }

        /* renamed from: c */
        public final boolean mo42015c() {
            if ((this.zzc & 8) != 0) {
                return true;
            }
            return false;
        }

        static {
            Covode.recordClassIndex(31191);
            C25776b bVar = new C25776b();
            zzl = bVar;
            AbstractC25981gj.m50560a(C25776b.class, bVar);
        }

        /* access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.measurement.AbstractC25981gj
        /* renamed from: a */
        public final Object mo42005a(int i) {
            MethodCollector.m26663i(6778);
            switch (C25772al.f60913a[i - 1]) {
                case 1:
                    C25776b bVar = new C25776b();
                    MethodCollector.m26664o(6778);
                    return bVar;
                case 2:
                    C25777a aVar = new C25777a((byte) 0);
                    MethodCollector.m26664o(6778);
                    return aVar;
                case 3:
                    Object a = m50558a(zzl, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zzc", "zzd", "zze", "zzf", C25778c.class, "zzg", "zzh", "zzi", "zzj", "zzk"});
                    MethodCollector.m26664o(6778);
                    return a;
                case 4:
                    C25776b bVar2 = zzl;
                    MethodCollector.m26664o(6778);
                    return bVar2;
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                    AbstractC26034id<C25776b> idVar = zzm;
                    if (idVar == null) {
                        synchronized (C25776b.class) {
                            try {
                                idVar = zzm;
                                if (idVar == null) {
                                    idVar = new AbstractC25981gj.C25984c<>(zzl);
                                    zzm = idVar;
                                }
                            } finally {
                                MethodCollector.m26664o(6778);
                            }
                        }
                    }
                    return idVar;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                    MethodCollector.m26664o(6778);
                    return (byte) 1;
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                    MethodCollector.m26664o(6778);
                    return null;
                default:
                    UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
                    MethodCollector.m26664o(6778);
                    throw unsupportedOperationException;
            }
        }

        /* renamed from: a */
        static /* synthetic */ void m49761a(C25776b bVar, int i, C25778c cVar) {
            cVar.getClass();
            AbstractC25995gs<C25778c> gsVar = bVar.zzf;
            if (!gsVar.mo42366a()) {
                bVar.zzf = AbstractC25981gj.m50557a(gsVar);
            }
            bVar.zzf.set(i, cVar);
        }
    }

    /* renamed from: com.google.android.gms.internal.measurement.am$c */
    public static final class C25778c extends AbstractC25981gj<C25778c, C25779a> {
        static final C25778c zzh;
        private static volatile AbstractC26034id<C25778c> zzi;
        public int zzc;
        private C25785f zzd;
        private C25780d zze;
        public boolean zzf;
        public String zzg = "";

        /* renamed from: com.google.android.gms.internal.measurement.am$c$a */
        public static final class C25779a extends AbstractC25981gj.AbstractC25982a<C25778c, C25779a> {
            static {
                Covode.recordClassIndex(31194);
            }

            private C25779a() {
                super(C25778c.zzh);
            }

            /* synthetic */ C25779a(byte b) {
                this();
            }

            /* renamed from: a */
            public final C25779a mo42018a(String str) {
                if (this.f61240b) {
                    mo42626t();
                    this.f61240b = false;
                }
                C25778c cVar = (C25778c) this.f61239a;
                str.getClass();
                cVar.zzc |= 8;
                cVar.zzg = str;
                return this;
            }
        }

        private C25778c() {
        }

        /* renamed from: b */
        public final C25785f mo42022b() {
            C25785f fVar = this.zzd;
            if (fVar == null) {
                return C25785f.zzh;
            }
            return fVar;
        }

        /* renamed from: d */
        public final C25780d mo42024d() {
            C25780d dVar = this.zze;
            if (dVar == null) {
                return C25780d.zzi;
            }
            return dVar;
        }

        /* renamed from: a */
        public final boolean mo42021a() {
            if ((this.zzc & 1) != 0) {
                return true;
            }
            return false;
        }

        /* renamed from: c */
        public final boolean mo42023c() {
            if ((this.zzc & 2) != 0) {
                return true;
            }
            return false;
        }

        /* renamed from: e */
        public final boolean mo42025e() {
            if ((this.zzc & 4) != 0) {
                return true;
            }
            return false;
        }

        static {
            Covode.recordClassIndex(31193);
            C25778c cVar = new C25778c();
            zzh = cVar;
            AbstractC25981gj.m50560a(C25778c.class, cVar);
        }

        /* access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.measurement.AbstractC25981gj
        /* renamed from: a */
        public final Object mo42005a(int i) {
            MethodCollector.m26663i(8111);
            switch (C25772al.f60913a[i - 1]) {
                case 1:
                    C25778c cVar = new C25778c();
                    MethodCollector.m26664o(8111);
                    return cVar;
                case 2:
                    C25779a aVar = new C25779a((byte) 0);
                    MethodCollector.m26664o(8111);
                    return aVar;
                case 3:
                    Object a = m50558a(zzh, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg"});
                    MethodCollector.m26664o(8111);
                    return a;
                case 4:
                    C25778c cVar2 = zzh;
                    MethodCollector.m26664o(8111);
                    return cVar2;
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                    AbstractC26034id<C25778c> idVar = zzi;
                    if (idVar == null) {
                        synchronized (C25778c.class) {
                            try {
                                idVar = zzi;
                                if (idVar == null) {
                                    idVar = new AbstractC25981gj.C25984c<>(zzh);
                                    zzi = idVar;
                                }
                            } finally {
                                MethodCollector.m26664o(8111);
                            }
                        }
                    }
                    return idVar;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                    MethodCollector.m26664o(8111);
                    return (byte) 1;
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                    MethodCollector.m26664o(8111);
                    return null;
                default:
                    UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
                    MethodCollector.m26664o(8111);
                    throw unsupportedOperationException;
            }
        }
    }

    /* renamed from: com.google.android.gms.internal.measurement.am$e */
    public static final class C25783e extends AbstractC25981gj<C25783e, C25784a> {
        static final C25783e zzj;
        private static volatile AbstractC26034id<C25783e> zzk;
        public int zzc;
        public int zzd;
        public String zze = "";
        private C25778c zzf;
        public boolean zzg;
        public boolean zzh;
        public boolean zzi;

        /* renamed from: com.google.android.gms.internal.measurement.am$e$a */
        public static final class C25784a extends AbstractC25981gj.AbstractC25982a<C25783e, C25784a> {
            static {
                Covode.recordClassIndex(31199);
            }

            private C25784a() {
                super(C25783e.zzj);
            }

            /* synthetic */ C25784a(byte b) {
                this();
            }

            /* renamed from: a */
            public final C25784a mo42018a(String str) {
                if (this.f61240b) {
                    mo42626t();
                    this.f61240b = false;
                }
                C25783e eVar = (C25783e) this.f61239a;
                str.getClass();
                eVar.zzc |= 2;
                eVar.zze = str;
                return this;
            }
        }

        private C25783e() {
        }

        /* renamed from: b */
        public final C25778c mo42035b() {
            C25778c cVar = this.zzf;
            if (cVar == null) {
                return C25778c.zzh;
            }
            return cVar;
        }

        /* renamed from: c */
        public static C25784a m49787c() {
            return (C25784a) zzj.mo42619j();
        }

        /* renamed from: a */
        public final boolean mo42034a() {
            if ((this.zzc & 1) != 0) {
                return true;
            }
            return false;
        }

        static {
            Covode.recordClassIndex(31198);
            C25783e eVar = new C25783e();
            zzj = eVar;
            AbstractC25981gj.m50560a(C25783e.class, eVar);
        }

        /* access modifiers changed from: protected */
        @Override // com.google.android.gms.internal.measurement.AbstractC25981gj
        /* renamed from: a */
        public final Object mo42005a(int i) {
            MethodCollector.m26663i(6067);
            switch (C25772al.f60913a[i - 1]) {
                case 1:
                    C25783e eVar = new C25783e();
                    MethodCollector.m26664o(6067);
                    return eVar;
                case 2:
                    C25784a aVar = new C25784a((byte) 0);
                    MethodCollector.m26664o(6067);
                    return aVar;
                case 3:
                    Object a = m50558a(zzj, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
                    MethodCollector.m26664o(6067);
                    return a;
                case 4:
                    C25783e eVar2 = zzj;
                    MethodCollector.m26664o(6067);
                    return eVar2;
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                    AbstractC26034id<C25783e> idVar = zzk;
                    if (idVar == null) {
                        synchronized (C25783e.class) {
                            try {
                                idVar = zzk;
                                if (idVar == null) {
                                    idVar = new AbstractC25981gj.C25984c<>(zzj);
                                    zzk = idVar;
                                }
                            } finally {
                                MethodCollector.m26664o(6067);
                            }
                        }
                    }
                    return idVar;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                    MethodCollector.m26664o(6067);
                    return (byte) 1;
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                    MethodCollector.m26664o(6067);
                    return null;
                default:
                    UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
                    MethodCollector.m26664o(6067);
                    throw unsupportedOperationException;
            }
        }
    }
}

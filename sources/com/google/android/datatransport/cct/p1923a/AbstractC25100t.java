package com.google.android.datatransport.cct.p1923a;

import android.util.SparseArray;
import com.bytedance.covode.number.Covode;

/* renamed from: com.google.android.datatransport.cct.a.t */
public abstract class AbstractC25100t {

    /* renamed from: com.google.android.datatransport.cct.a.t$a */
    public static abstract class AbstractC25101a {
        static {
            Covode.recordClassIndex(30466);
        }

        /* renamed from: a */
        public abstract AbstractC25101a mo41051a(EnumC25102b bVar);

        /* renamed from: a */
        public abstract AbstractC25101a mo41052a(EnumC25103c cVar);

        /* renamed from: a */
        public abstract AbstractC25100t mo41053a();
    }

    static {
        Covode.recordClassIndex(30465);
    }

    /* JADX INFO: Failed to restore enum class, 'enum' modifier removed */
    /* renamed from: com.google.android.datatransport.cct.a.t$b */
    public static final class EnumC25102b extends Enum<EnumC25102b> {

        /* renamed from: a */
        private static final SparseArray<EnumC25102b> f59510a;
        public static final EnumC25102b zza;
        public static final EnumC25102b zzb;
        public static final EnumC25102b zzc;
        public static final EnumC25102b zzd;
        public static final EnumC25102b zze;
        public static final EnumC25102b zzf;
        public static final EnumC25102b zzg;
        public static final EnumC25102b zzh;
        public static final EnumC25102b zzi;
        public static final EnumC25102b zzj;
        public static final EnumC25102b zzk;
        public static final EnumC25102b zzl;
        public static final EnumC25102b zzm;
        public static final EnumC25102b zzn;
        public static final EnumC25102b zzo;
        public static final EnumC25102b zzp;
        public static final EnumC25102b zzq;
        public static final EnumC25102b zzr;
        public static final EnumC25102b zzs;
        public static final EnumC25102b zzt;
        public static final EnumC25102b zzu = new EnumC25102b("COMBINED", 20, 100);

        /* renamed from: b */
        private final int f59511b;

        public final int zza() {
            return this.f59511b;
        }

        static {
            Covode.recordClassIndex(30467);
            EnumC25102b bVar = new EnumC25102b("UNKNOWN_MOBILE_SUBTYPE", 0, 0);
            zza = bVar;
            EnumC25102b bVar2 = new EnumC25102b("GPRS", 1, 1);
            zzb = bVar2;
            EnumC25102b bVar3 = new EnumC25102b("EDGE", 2, 2);
            zzc = bVar3;
            EnumC25102b bVar4 = new EnumC25102b("UMTS", 3, 3);
            zzd = bVar4;
            EnumC25102b bVar5 = new EnumC25102b("CDMA", 4, 4);
            zze = bVar5;
            EnumC25102b bVar6 = new EnumC25102b("EVDO_0", 5, 5);
            zzf = bVar6;
            EnumC25102b bVar7 = new EnumC25102b("EVDO_A", 6, 6);
            zzg = bVar7;
            EnumC25102b bVar8 = new EnumC25102b("RTT", 7, 7);
            zzh = bVar8;
            EnumC25102b bVar9 = new EnumC25102b("HSDPA", 8, 8);
            zzi = bVar9;
            EnumC25102b bVar10 = new EnumC25102b("HSUPA", 9, 9);
            zzj = bVar10;
            EnumC25102b bVar11 = new EnumC25102b("HSPA", 10, 10);
            zzk = bVar11;
            EnumC25102b bVar12 = new EnumC25102b("IDEN", 11, 11);
            zzl = bVar12;
            EnumC25102b bVar13 = new EnumC25102b("EVDO_B", 12, 12);
            zzm = bVar13;
            EnumC25102b bVar14 = new EnumC25102b("LTE", 13, 13);
            zzn = bVar14;
            EnumC25102b bVar15 = new EnumC25102b("EHRPD", 14, 14);
            zzo = bVar15;
            EnumC25102b bVar16 = new EnumC25102b("HSPAP", 15, 15);
            zzp = bVar16;
            EnumC25102b bVar17 = new EnumC25102b("GSM", 16, 16);
            zzq = bVar17;
            EnumC25102b bVar18 = new EnumC25102b("TD_SCDMA", 17, 17);
            zzr = bVar18;
            EnumC25102b bVar19 = new EnumC25102b("IWLAN", 18, 18);
            zzs = bVar19;
            EnumC25102b bVar20 = new EnumC25102b("LTE_CA", 19, 19);
            zzt = bVar20;
            SparseArray<EnumC25102b> sparseArray = new SparseArray<>();
            f59510a = sparseArray;
            sparseArray.put(0, bVar);
            sparseArray.put(1, bVar2);
            sparseArray.put(2, bVar3);
            sparseArray.put(3, bVar4);
            sparseArray.put(4, bVar5);
            sparseArray.put(5, bVar6);
            sparseArray.put(6, bVar7);
            sparseArray.put(7, bVar8);
            sparseArray.put(8, bVar9);
            sparseArray.put(9, bVar10);
            sparseArray.put(10, bVar11);
            sparseArray.put(11, bVar12);
            sparseArray.put(12, bVar13);
            sparseArray.put(13, bVar14);
            sparseArray.put(14, bVar15);
            sparseArray.put(15, bVar16);
            sparseArray.put(16, bVar17);
            sparseArray.put(17, bVar18);
            sparseArray.put(18, bVar19);
            sparseArray.put(19, bVar20);
        }

        public static EnumC25102b zza(int i) {
            return f59510a.get(i);
        }

        private EnumC25102b(String str, int i, int i2) {
            this.f59511b = i2;
        }
    }

    /* JADX INFO: Failed to restore enum class, 'enum' modifier removed */
    /* renamed from: com.google.android.datatransport.cct.a.t$c */
    public static final class EnumC25103c extends Enum<EnumC25103c> {

        /* renamed from: a */
        private static final SparseArray<EnumC25103c> f59512a;
        public static final EnumC25103c zza;
        public static final EnumC25103c zzb;
        public static final EnumC25103c zzc;
        public static final EnumC25103c zzd;
        public static final EnumC25103c zze;
        public static final EnumC25103c zzf;
        public static final EnumC25103c zzg;
        public static final EnumC25103c zzh;
        public static final EnumC25103c zzi;
        public static final EnumC25103c zzj;
        public static final EnumC25103c zzk;
        public static final EnumC25103c zzl;
        public static final EnumC25103c zzm;
        public static final EnumC25103c zzn;
        public static final EnumC25103c zzo;
        public static final EnumC25103c zzp;
        public static final EnumC25103c zzq;
        public static final EnumC25103c zzr;
        public static final EnumC25103c zzs;

        /* renamed from: b */
        private final int f59513b;

        public final int zza() {
            return this.f59513b;
        }

        static {
            Covode.recordClassIndex(30468);
            EnumC25103c cVar = new EnumC25103c("MOBILE", 0, 0);
            zza = cVar;
            EnumC25103c cVar2 = new EnumC25103c("WIFI", 1, 1);
            zzb = cVar2;
            EnumC25103c cVar3 = new EnumC25103c("MOBILE_MMS", 2, 2);
            zzc = cVar3;
            EnumC25103c cVar4 = new EnumC25103c("MOBILE_SUPL", 3, 3);
            zzd = cVar4;
            EnumC25103c cVar5 = new EnumC25103c("MOBILE_DUN", 4, 4);
            zze = cVar5;
            EnumC25103c cVar6 = new EnumC25103c("MOBILE_HIPRI", 5, 5);
            zzf = cVar6;
            EnumC25103c cVar7 = new EnumC25103c("WIMAX", 6, 6);
            zzg = cVar7;
            EnumC25103c cVar8 = new EnumC25103c("BLUETOOTH", 7, 7);
            zzh = cVar8;
            EnumC25103c cVar9 = new EnumC25103c("DUMMY", 8, 8);
            zzi = cVar9;
            EnumC25103c cVar10 = new EnumC25103c("ETHERNET", 9, 9);
            zzj = cVar10;
            EnumC25103c cVar11 = new EnumC25103c("MOBILE_FOTA", 10, 10);
            zzk = cVar11;
            EnumC25103c cVar12 = new EnumC25103c("MOBILE_IMS", 11, 11);
            zzl = cVar12;
            EnumC25103c cVar13 = new EnumC25103c("MOBILE_CBS", 12, 12);
            zzm = cVar13;
            EnumC25103c cVar14 = new EnumC25103c("WIFI_P2P", 13, 13);
            zzn = cVar14;
            EnumC25103c cVar15 = new EnumC25103c("MOBILE_IA", 14, 14);
            zzo = cVar15;
            EnumC25103c cVar16 = new EnumC25103c("MOBILE_EMERGENCY", 15, 15);
            zzp = cVar16;
            EnumC25103c cVar17 = new EnumC25103c("PROXY", 16, 16);
            zzq = cVar17;
            EnumC25103c cVar18 = new EnumC25103c("VPN", 17, 17);
            zzr = cVar18;
            EnumC25103c cVar19 = new EnumC25103c("NONE", 18, -1);
            zzs = cVar19;
            SparseArray<EnumC25103c> sparseArray = new SparseArray<>();
            f59512a = sparseArray;
            sparseArray.put(0, cVar);
            sparseArray.put(1, cVar2);
            sparseArray.put(2, cVar3);
            sparseArray.put(3, cVar4);
            sparseArray.put(4, cVar5);
            sparseArray.put(5, cVar6);
            sparseArray.put(6, cVar7);
            sparseArray.put(7, cVar8);
            sparseArray.put(8, cVar9);
            sparseArray.put(9, cVar10);
            sparseArray.put(10, cVar11);
            sparseArray.put(11, cVar12);
            sparseArray.put(12, cVar13);
            sparseArray.put(13, cVar14);
            sparseArray.put(14, cVar15);
            sparseArray.put(15, cVar16);
            sparseArray.put(16, cVar17);
            sparseArray.put(17, cVar18);
            sparseArray.put(-1, cVar19);
        }

        public static EnumC25103c zza(int i) {
            return f59512a.get(i);
        }

        private EnumC25103c(String str, int i, int i2) {
            this.f59513b = i2;
        }
    }
}

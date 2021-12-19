package com.google.android.datatransport.cct.p1923a;

import android.util.SparseArray;
import com.bytedance.covode.number.Covode;

/* JADX INFO: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: com.google.android.datatransport.cct.a.b */
public final class EnumC25073b extends Enum<EnumC25073b> {

    /* renamed from: a */
    private static final SparseArray<EnumC25073b> f59455a;
    public static final EnumC25073b zza;
    public static final EnumC25073b zzb;
    public static final EnumC25073b zzc;
    public static final EnumC25073b zzd;
    public static final EnumC25073b zze;
    public static final EnumC25073b zzf;

    static {
        Covode.recordClassIndex(30438);
        EnumC25073b bVar = new EnumC25073b("DEFAULT", 0);
        zza = bVar;
        EnumC25073b bVar2 = new EnumC25073b("UNMETERED_ONLY", 1);
        zzb = bVar2;
        EnumC25073b bVar3 = new EnumC25073b("UNMETERED_OR_DAILY", 2);
        zzc = bVar3;
        EnumC25073b bVar4 = new EnumC25073b("FAST_IF_RADIO_AWAKE", 3);
        zzd = bVar4;
        EnumC25073b bVar5 = new EnumC25073b("NEVER", 4);
        zze = bVar5;
        EnumC25073b bVar6 = new EnumC25073b("UNRECOGNIZED", 5);
        zzf = bVar6;
        SparseArray<EnumC25073b> sparseArray = new SparseArray<>();
        f59455a = sparseArray;
        sparseArray.put(0, bVar);
        sparseArray.put(1, bVar2);
        sparseArray.put(2, bVar3);
        sparseArray.put(3, bVar4);
        sparseArray.put(4, bVar5);
        sparseArray.put(-1, bVar6);
    }

    private EnumC25073b(String str, int i) {
    }
}

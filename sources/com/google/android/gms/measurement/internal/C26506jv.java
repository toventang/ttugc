package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.gms.common.internal.C25565r;
import com.google.android.gms.common.util.AbstractC25603e;
import com.google.android.gms.internal.measurement.AbstractC25981gj;
import com.google.android.gms.internal.measurement.AbstractC25995gs;
import com.google.android.gms.internal.measurement.AbstractC26023ht;
import com.google.android.gms.internal.measurement.C25773am;
import com.google.android.gms.internal.measurement.C25802av;
import com.google.android.gms.internal.measurement.C25832bb;
import com.google.android.gms.internal.measurement.C25846bp;
import com.google.android.gms.internal.measurement.C25965fv;
import com.google.android.gms.internal.measurement.C26109ku;
import com.kakao.usermgmt.StringSet;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* renamed from: com.google.android.gms.measurement.internal.jv */
public final class C26506jv extends AbstractC26500jp {
    static {
        Covode.recordClassIndex(31928);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.measurement.internal.AbstractC26500jp
    /* renamed from: d */
    public final boolean mo43092d() {
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.C26401fz
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo42994a() {
        super.mo42994a();
    }

    @Override // com.google.android.gms.measurement.internal.C26401fz
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo42999b() {
        super.mo42999b();
    }

    @Override // com.google.android.gms.measurement.internal.C26401fz
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo43002c() {
        super.mo43002c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo43499a(C25802av.C25824k.C25825a aVar, Object obj) {
        C25565r.m49314a(obj);
        aVar.mo42007a().mo42180b().mo42183c();
        if (obj instanceof String) {
            aVar.mo42182b((String) obj);
        } else if (obj instanceof Long) {
            aVar.mo42181b(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            aVar.mo42178a(((Double) obj).doubleValue());
        } else {
            mo43016q().f61827c.mo43170a("Ignoring invalid (type) user attribute value", obj);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo43498a(C25802av.C25811e.C25812a aVar, Object obj) {
        C25565r.m49314a(obj);
        aVar.mo42007a().mo42089b().mo42091c().mo42093e();
        if (obj instanceof String) {
            aVar.mo42090b((String) obj);
        } else if (obj instanceof Long) {
            aVar.mo42086a(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            aVar.mo42085a(((Double) obj).doubleValue());
        } else {
            C26109ku.m51181b();
            if (!mo43018s().mo43641d(null, C26530p.f62495aG) || !(obj instanceof Bundle[])) {
                mo43016q().f61827c.mo43170a("Ignoring invalid (type) event param value", obj);
            } else {
                aVar.mo42088a(m52336a((Bundle[]) obj));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C25802av.C25807c mo43492a(C26527m mVar) {
        C25802av.C25807c.C25808a b = C25802av.C25807c.m49834c().mo42074b(mVar.f62457d);
        Iterator<String> it = mVar.f62458e.iterator();
        while (it.hasNext()) {
            String next = it.next();
            C25802av.C25811e.C25812a a = C25802av.C25811e.m49862e().mo42018a(next);
            mo43498a(a, mVar.f62458e.mo43666a(next));
            b.mo42068a(a);
        }
        return (C25802av.C25807c) ((AbstractC25981gj) b.mo42629w());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo43497a(C25802av.C25807c.C25808a aVar, String str, Object obj) {
        List a = aVar.mo42007a();
        int i = 0;
        while (true) {
            if (i >= a.size()) {
                i = -1;
                break;
            } else if (str.equals(((C25802av.C25811e) a.get(i)).zzd)) {
                break;
            } else {
                i++;
            }
        }
        C25802av.C25811e.C25812a a2 = C25802av.C25811e.m49862e().mo42018a(str);
        if (obj instanceof Long) {
            a2.mo42086a(((Long) obj).longValue());
        } else if (obj instanceof String) {
            a2.mo42090b((String) obj);
        } else if (obj instanceof Double) {
            a2.mo42085a(((Double) obj).doubleValue());
        } else {
            C26109ku.m51181b();
            if (mo43018s().mo43641d(null, C26530p.f62495aG) && (obj instanceof Bundle[])) {
                a2.mo42088a(m52336a((Bundle[]) obj));
            }
        }
        if (i >= 0) {
            aVar.mo42065a(i, a2);
        } else {
            aVar.mo42068a(a2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final String mo43495a(C25802av.C25813f fVar) {
        C25802av.C25820i iVar;
        if (fVar == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nbatch {\n");
        for (C25802av.C25815g gVar : fVar.zzc) {
            if (gVar != null) {
                m52337a(sb, 1);
                sb.append("bundle {\n");
                if ((gVar.zzc & 1) != 0) {
                    m52340a(sb, 1, "protocol_version", Integer.valueOf(gVar.zze));
                }
                m52340a(sb, 1, "platform", gVar.zzm);
                if ((gVar.zzc & 16384) != 0) {
                    m52340a(sb, 1, "gmp_version", Long.valueOf(gVar.zzu));
                }
                if ((gVar.zzc & 32768) != 0) {
                    m52340a(sb, 1, "uploading_gmp_version", Long.valueOf(gVar.zzv));
                }
                if ((gVar.zzd & 16) != 0) {
                    m52340a(sb, 1, "dynamite_version", Long.valueOf(gVar.zzas));
                }
                if ((gVar.zzc & 536870912) != 0) {
                    m52340a(sb, 1, "config_version", Long.valueOf(gVar.zzak));
                }
                m52340a(sb, 1, "gmp_app_id", gVar.zzac);
                m52340a(sb, 1, "admob_app_id", gVar.zzap);
                m52340a(sb, 1, "app_id", gVar.zzs);
                m52340a(sb, 1, "app_version", gVar.zzt);
                if ((gVar.zzc & 33554432) != 0) {
                    m52340a(sb, 1, "app_version_major", Integer.valueOf(gVar.zzag));
                }
                m52340a(sb, 1, "firebase_instance_id", gVar.zzaf);
                if ((gVar.zzc & 524288) != 0) {
                    m52340a(sb, 1, "dev_cert_hash", Long.valueOf(gVar.zzz));
                }
                m52340a(sb, 1, "app_store", gVar.zzr);
                if ((gVar.zzc & 2) != 0) {
                    m52340a(sb, 1, "upload_timestamp_millis", Long.valueOf(gVar.zzh));
                }
                if ((gVar.zzc & 4) != 0) {
                    m52340a(sb, 1, "start_timestamp_millis", Long.valueOf(gVar.zzi));
                }
                if (gVar.mo42095a()) {
                    m52340a(sb, 1, "end_timestamp_millis", Long.valueOf(gVar.zzj));
                }
                if ((gVar.zzc & 16) != 0) {
                    m52340a(sb, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(gVar.zzk));
                }
                if ((gVar.zzc & 32) != 0) {
                    m52340a(sb, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(gVar.zzl));
                }
                m52340a(sb, 1, "app_instance_id", gVar.zzy);
                m52340a(sb, 1, "resettable_device_id", gVar.zzw);
                m52340a(sb, 1, "device_id", gVar.zzaj);
                m52340a(sb, 1, "ds_id", gVar.zzam);
                if ((gVar.zzc & 131072) != 0) {
                    m52340a(sb, 1, "limited_ad_tracking", Boolean.valueOf(gVar.zzx));
                }
                m52340a(sb, 1, "os_version", gVar.zzn);
                m52340a(sb, 1, "device_model", gVar.zzo);
                m52340a(sb, 1, "user_default_language", gVar.zzp);
                if ((gVar.zzc & 1024) != 0) {
                    m52340a(sb, 1, "time_zone_offset_minutes", Integer.valueOf(gVar.zzq));
                }
                if ((gVar.zzc & 1048576) != 0) {
                    m52340a(sb, 1, "bundle_sequential_index", Integer.valueOf(gVar.zzaa));
                }
                if ((gVar.zzc & 8388608) != 0) {
                    m52340a(sb, 1, "service_upload", Boolean.valueOf(gVar.zzad));
                }
                m52340a(sb, 1, "health_monitor", gVar.zzab);
                if (!(mo43018s().mo43641d(null, C26530p.f62501aM) || (gVar.zzc & 1073741824) == 0 || gVar.zzal == 0)) {
                    m52340a(sb, 1, "android_id", Long.valueOf(gVar.zzal));
                }
                if (gVar.mo42096b()) {
                    m52340a(sb, 1, "retry_counter", Integer.valueOf(gVar.zzao));
                }
                AbstractC25995gs<C25802av.C25824k> gsVar = gVar.zzg;
                if (gsVar != null) {
                    for (C25802av.C25824k kVar : gsVar) {
                        if (kVar != null) {
                            m52337a(sb, 2);
                            sb.append("user_property {\n");
                            m52340a(sb, 2, "set_timestamp_millis", kVar.mo42175a() ? Long.valueOf(kVar.zzd) : null);
                            m52340a(sb, 2, StringSet.name, mo43013n().mo43064c(kVar.zze));
                            m52340a(sb, 2, "string_value", kVar.zzf);
                            m52340a(sb, 2, "int_value", kVar.mo42176b() ? Long.valueOf(kVar.zzg) : null);
                            m52340a(sb, 2, "double_value", kVar.mo42177c() ? Double.valueOf(kVar.zzi) : null);
                            m52337a(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                AbstractC25995gs<C25802av.C25803a> gsVar2 = gVar.zzae;
                if (gsVar2 != null) {
                    for (C25802av.C25803a aVar : gsVar2) {
                        if (aVar != null) {
                            m52337a(sb, 2);
                            sb.append("audience_membership {\n");
                            if ((aVar.zzc & 1) != 0) {
                                m52340a(sb, 2, "audience_id", Integer.valueOf(aVar.zzd));
                            }
                            if ((aVar.zzc & 8) != 0) {
                                m52340a(sb, 2, "new_audience", Boolean.valueOf(aVar.zzg));
                            }
                            m52342a(sb, "current_data", aVar.mo42054a());
                            if ((aVar.zzc & 4) != 0) {
                                if (aVar.zzf == null) {
                                    iVar = C25802av.C25820i.zzg;
                                } else {
                                    iVar = aVar.zzf;
                                }
                                m52342a(sb, "previous_data", iVar);
                            }
                            m52337a(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                AbstractC25995gs<C25802av.C25807c> gsVar3 = gVar.zzf;
                if (gsVar3 != null) {
                    for (C25802av.C25807c cVar : gsVar3) {
                        if (cVar != null) {
                            m52337a(sb, 2);
                            sb.append("event {\n");
                            m52340a(sb, 2, StringSet.name, mo43013n().mo43062a(cVar.zze));
                            if (cVar.mo42064b()) {
                                m52340a(sb, 2, "timestamp_millis", Long.valueOf(cVar.zzf));
                            }
                            if ((cVar.zzc & 4) != 0) {
                                m52340a(sb, 2, "previous_timestamp_millis", Long.valueOf(cVar.zzg));
                            }
                            if ((cVar.zzc & 8) != 0) {
                                m52340a(sb, 2, "count", Integer.valueOf(cVar.zzh));
                            }
                            if (cVar.mo42063a() != 0) {
                                m52341a(sb, 2, cVar.zzd);
                            }
                            m52337a(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                m52337a(sb, 1);
                sb.append("}\n");
            }
        }
        sb.append("}\n");
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final String mo43493a(C25773am.C25776b bVar) {
        if (bVar == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nevent_filter {\n");
        if (bVar.mo42013a()) {
            m52340a(sb, 0, "filter_id", Integer.valueOf(bVar.zzd));
        }
        m52340a(sb, 0, "event_name", mo43013n().mo43062a(bVar.zze));
        String a = m52334a(bVar.zzi, bVar.zzj, bVar.zzk);
        if (!a.isEmpty()) {
            m52340a(sb, 0, "filter_type", a);
        }
        if (bVar.mo42015c()) {
            m52339a(sb, 1, "event_count_filter", bVar.mo42016d());
        }
        if (bVar.mo42014b() > 0) {
            sb.append("  filters {\n");
            for (C25773am.C25778c cVar : bVar.zzf) {
                m52338a(sb, 2, cVar);
            }
        }
        m52337a(sb, 1);
        sb.append("}\n}\n");
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final String mo43494a(C25773am.C25783e eVar) {
        if (eVar == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nproperty_filter {\n");
        if (eVar.mo42034a()) {
            m52340a(sb, 0, "filter_id", Integer.valueOf(eVar.zzd));
        }
        m52340a(sb, 0, "property_name", mo43013n().mo43064c(eVar.zze));
        String a = m52334a(eVar.zzg, eVar.zzh, eVar.zzi);
        if (!a.isEmpty()) {
            m52340a(sb, 0, "filter_type", a);
        }
        m52338a(sb, 1, eVar.mo42035b());
        sb.append("}\n");
        return sb.toString();
    }

    /* renamed from: a */
    private final void m52341a(StringBuilder sb, int i, List<C25802av.C25811e> list) {
        if (list != null) {
            int i2 = i + 1;
            for (C25802av.C25811e eVar : list) {
                if (eVar != null) {
                    m52337a(sb, i2);
                    sb.append("param {\n");
                    C26109ku.m51181b();
                    Double d = null;
                    if (mo43018s().mo43641d(null, C26530p.f62493aE)) {
                        m52340a(sb, i2, StringSet.name, (eVar.zzc & 1) != 0 ? mo43013n().mo43063b(eVar.zzd) : null);
                        m52340a(sb, i2, "string_value", eVar.mo42081a() ? eVar.zze : null);
                        m52340a(sb, i2, "int_value", eVar.mo42082b() ? Long.valueOf(eVar.zzf) : null);
                        if (eVar.mo42083c()) {
                            d = Double.valueOf(eVar.zzh);
                        }
                        m52340a(sb, i2, "double_value", d);
                        if (eVar.mo42084d() > 0) {
                            m52341a(sb, i2, eVar.zzi);
                        }
                    } else {
                        m52340a(sb, i2, StringSet.name, mo43013n().mo43063b(eVar.zzd));
                        m52340a(sb, i2, "string_value", eVar.zze);
                        m52340a(sb, i2, "int_value", eVar.mo42082b() ? Long.valueOf(eVar.zzf) : null);
                        if (eVar.mo42083c()) {
                            d = Double.valueOf(eVar.zzh);
                        }
                        m52340a(sb, i2, "double_value", d);
                    }
                    m52337a(sb, i2);
                    sb.append("}\n");
                }
            }
        }
    }

    /* renamed from: a */
    private static void m52342a(StringBuilder sb, String str, C25802av.C25820i iVar) {
        if (iVar != null) {
            m52337a(sb, 3);
            sb.append(str);
            sb.append(" {\n");
            if (iVar.zzd.size() != 0) {
                m52337a(sb, 4);
                sb.append("results: ");
                int i = 0;
                for (Object obj : iVar.zzd) {
                    int i2 = i + 1;
                    if (i != 0) {
                        sb.append(", ");
                    }
                    sb.append(obj);
                    i = i2;
                }
                sb.append('\n');
            }
            if (iVar.mo42161a() != 0) {
                m52337a(sb, 4);
                sb.append("status: ");
                int i3 = 0;
                for (Object obj2 : iVar.zzc) {
                    int i4 = i3 + 1;
                    if (i3 != 0) {
                        sb.append(", ");
                    }
                    sb.append(obj2);
                    i3 = i4;
                }
                sb.append('\n');
            }
            if (iVar.mo42162b() != 0) {
                m52337a(sb, 4);
                sb.append("dynamic_filter_timestamps: {");
                int i5 = 0;
                for (C25802av.C25805b bVar : iVar.zze) {
                    int i6 = i5 + 1;
                    if (i5 != 0) {
                        sb.append(", ");
                    }
                    sb.append(bVar.mo42059a() ? Integer.valueOf(bVar.zzd) : null).append(":").append(bVar.mo42060b() ? Long.valueOf(bVar.zze) : null);
                    i5 = i6;
                }
                sb.append("}\n");
            }
            if (iVar.mo42163c() != 0) {
                m52337a(sb, 4);
                sb.append("sequence_filter_timestamps: {");
                int i7 = 0;
                for (C25802av.C25822j jVar : iVar.zzf) {
                    int i8 = i7 + 1;
                    if (i7 != 0) {
                        sb.append(", ");
                    }
                    sb.append(jVar.mo42171a() ? Integer.valueOf(jVar.zzd) : null).append(": [");
                    int i9 = 0;
                    for (Long l : jVar.zze) {
                        long longValue = l.longValue();
                        int i10 = i9 + 1;
                        if (i9 != 0) {
                            sb.append(", ");
                        }
                        sb.append(longValue);
                        i9 = i10;
                    }
                    sb.append("]");
                    i7 = i8;
                }
                sb.append("}\n");
            }
            m52337a(sb, 3);
            sb.append("}\n");
        }
    }

    /* renamed from: a */
    private static void m52339a(StringBuilder sb, int i, String str, C25773am.C25780d dVar) {
        if (dVar != null) {
            m52337a(sb, i);
            sb.append(str);
            sb.append(" {\n");
            if (dVar.mo42026a()) {
                m52340a(sb, i, "comparison_type", dVar.mo42027b().name());
            }
            if (dVar.mo42028c()) {
                m52340a(sb, i, "match_as_float", Boolean.valueOf(dVar.zze));
            }
            if (dVar.mo42029d()) {
                m52340a(sb, i, "comparison_value", dVar.zzf);
            }
            if (dVar.mo42030e()) {
                m52340a(sb, i, "min_comparison_value", dVar.zzg);
            }
            if (dVar.mo42031f()) {
                m52340a(sb, i, "max_comparison_value", dVar.zzh);
            }
            m52337a(sb, i);
            sb.append("}\n");
        }
    }

    /* renamed from: a */
    private static void m52340a(StringBuilder sb, int i, String str, Object obj) {
        if (obj != null) {
            m52337a(sb, i + 1);
            sb.append(str);
            sb.append(": ");
            sb.append(obj);
            sb.append('\n');
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:8|9|10|11) */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0028, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0029, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002a, code lost:
        r2.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002d, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        mo43016q().f61827c.mo43169a("Failed to load parcelable from buffer");
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x001a */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T extends android.os.Parcelable> T mo43491a(byte[] r5, android.os.Parcelable.Creator<T> r6) {
        /*
            r4 = this;
            r3 = 0
            if (r5 != 0) goto L_0x0004
            return r3
        L_0x0004:
            android.os.Parcel r2 = android.os.Parcel.obtain()
            int r1 = r5.length     // Catch:{ a -> 0x001a }
            r0 = 0
            r2.unmarshall(r5, r0, r1)     // Catch:{ a -> 0x001a }
            r2.setDataPosition(r0)     // Catch:{ a -> 0x001a }
            java.lang.Object r0 = r6.createFromParcel(r2)     // Catch:{ a -> 0x001a }
            android.os.Parcelable r0 = (android.os.Parcelable) r0     // Catch:{ a -> 0x001a }
            r2.recycle()
            return r0
        L_0x001a:
            com.google.android.gms.measurement.internal.eb r0 = r4.mo43016q()     // Catch:{ all -> 0x0029 }
            com.google.android.gms.measurement.internal.ee r1 = r0.f61827c     // Catch:{ all -> 0x0029 }
            java.lang.String r0 = "Failed to load parcelable from buffer"
            r1.mo43169a(r0)     // Catch:{ all -> 0x0029 }
            r2.recycle()
            return r3
        L_0x0029:
            r0 = move-exception
            r2.recycle()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C26506jv.mo43491a(byte[], android.os.Parcelable$Creator):android.os.Parcelable");
    }

    /* renamed from: a */
    static boolean m52343a(zzao zzao, zzn zzn) {
        C25565r.m49314a(zzao);
        C25565r.m49314a(zzn);
        return !TextUtils.isEmpty(zzn.f62591b) || !TextUtils.isEmpty(zzn.f62607r);
    }

    /* renamed from: a */
    static boolean m52344a(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    /* renamed from: a */
    static boolean m52345a(List<Long> list, int i) {
        if (i >= (list.size() << 6)) {
            return false;
        }
        return ((1 << (i % 64)) & list.get(i / 64).longValue()) != 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final List<Long> mo43496a(List<Long> list, List<Integer> list2) {
        ArrayList arrayList = new ArrayList(list);
        for (Integer num : list2) {
            if (num.intValue() < 0) {
                mo43016q().f61830f.mo43170a("Ignoring negative bit index to be cleared", num);
            } else {
                int intValue = num.intValue() / 64;
                if (intValue >= arrayList.size()) {
                    mo43016q().f61830f.mo43171a("Ignoring bit index greater than bitSet size", num, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(intValue, Long.valueOf(((Long) arrayList.get(intValue)).longValue() & ((1 << (num.intValue() % 64)) ^ -1)));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            size = size2;
            if (size >= 0 && ((Long) arrayList.get(size)).longValue() == 0) {
                size2 = size - 1;
            }
        }
        return arrayList.subList(0, size);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo43500a(long j, long j2) {
        return j == 0 || j2 <= 0 || Math.abs(mo43011l().mo41857a() - j) > j2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final long mo43490a(byte[] bArr) {
        C25565r.m49314a(bArr);
        mo43014o().mo43002c();
        MessageDigest h = C26510jz.m52409h();
        if (h != null) {
            return C26510jz.m52383a(h.digest(bArr));
        }
        mo43016q().f61827c.mo43169a("Failed to get MD5");
        return 0;
    }

    @Override // com.google.android.gms.measurement.internal.C26496jm
    /* renamed from: I_ */
    public final /* bridge */ /* synthetic */ C26373ey mo43173I_() {
        return super.mo43173I_();
    }

    @Override // com.google.android.gms.measurement.internal.C26496jm
    /* renamed from: J_ */
    public final /* bridge */ /* synthetic */ C26348e mo43174J_() {
        return super.mo43174J_();
    }

    @Override // com.google.android.gms.measurement.internal.C26496jm
    /* renamed from: K_ */
    public final /* bridge */ /* synthetic */ C26515kd mo43175K_() {
        return super.mo43175K_();
    }

    @Override // com.google.android.gms.measurement.internal.C26496jm
    /* renamed from: L_ */
    public final /* bridge */ /* synthetic */ C26506jv mo43176L_() {
        return super.mo43176L_();
    }

    @Override // com.google.android.gms.measurement.internal.C26401fz
    /* renamed from: k */
    public final /* bridge */ /* synthetic */ C26483j mo43010k() {
        return super.mo43010k();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC26404gb, com.google.android.gms.measurement.internal.C26401fz
    /* renamed from: l */
    public final /* bridge */ /* synthetic */ AbstractC25603e mo43011l() {
        return super.mo43011l();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC26404gb, com.google.android.gms.measurement.internal.C26401fz
    /* renamed from: m */
    public final /* bridge */ /* synthetic */ Context mo43012m() {
        return super.mo43012m();
    }

    @Override // com.google.android.gms.measurement.internal.C26401fz
    /* renamed from: n */
    public final /* bridge */ /* synthetic */ C26347dz mo43013n() {
        return super.mo43013n();
    }

    @Override // com.google.android.gms.measurement.internal.C26401fz
    /* renamed from: o */
    public final /* bridge */ /* synthetic */ C26510jz mo43014o() {
        return super.mo43014o();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC26404gb, com.google.android.gms.measurement.internal.C26401fz
    /* renamed from: p */
    public final /* bridge */ /* synthetic */ C26372ex mo43015p() {
        return super.mo43015p();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC26404gb, com.google.android.gms.measurement.internal.C26401fz
    /* renamed from: q */
    public final /* bridge */ /* synthetic */ C26350eb mo43016q() {
        return super.mo43016q();
    }

    @Override // com.google.android.gms.measurement.internal.C26401fz
    /* renamed from: r */
    public final /* bridge */ /* synthetic */ C26361em mo43017r() {
        return super.mo43017r();
    }

    @Override // com.google.android.gms.measurement.internal.C26401fz
    /* renamed from: s */
    public final /* bridge */ /* synthetic */ C26524km mo43018s() {
        return super.mo43018s();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC26404gb, com.google.android.gms.measurement.internal.C26401fz
    /* renamed from: t */
    public final /* bridge */ /* synthetic */ C26523kl mo43019t() {
        return super.mo43019t();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final List<Integer> mo43504e() {
        Map<String, String> a;
        C25832bb a2 = C25832bb.m50019a(this.f62350j.mo43012m().getContentResolver(), C25846bp.m50044a("com.google.android.gms.measurement"));
        if (a2 == null) {
            a = Collections.emptyMap();
        } else {
            a = a2.mo42188a();
        }
        if (a == null || a.size() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int intValue = C26530p.f62477P.mo43024a(null).intValue();
        Iterator<Map.Entry<String, String>> it = a.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry<String, String> next = it.next();
            if (next.getKey().startsWith("measurement.id.")) {
                try {
                    int parseInt = Integer.parseInt(next.getValue());
                    if (parseInt != 0) {
                        arrayList.add(Integer.valueOf(parseInt));
                        if (arrayList.size() >= intValue) {
                            mo43016q().f61830f.mo43170a("Too many experiment IDs. Number of IDs", Integer.valueOf(arrayList.size()));
                            break;
                        }
                    } else {
                        continue;
                    }
                } catch (NumberFormatException e) {
                    mo43016q().f61830f.mo43170a("Experiment ID NumberFormatException", e);
                }
            }
        }
        if (arrayList.size() == 0) {
            return null;
        }
        return arrayList;
    }

    C26506jv(C26498jo joVar) {
        super(joVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final byte[] mo43503c(byte[] bArr) {
        MethodCollector.m26663i(7950);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            MethodCollector.m26664o(7950);
            return byteArray;
        } catch (IOException e) {
            mo43016q().f61827c.mo43170a("Failed to gzip content", e);
            MethodCollector.m26664o(7950);
            throw e;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final byte[] mo43502b(byte[] bArr) {
        MethodCollector.m26663i(7948);
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr2 = new byte[1024];
            while (true) {
                int read = gZIPInputStream.read(bArr2);
                if (read > 0) {
                    byteArrayOutputStream.write(bArr2, 0, read);
                } else {
                    gZIPInputStream.close();
                    byteArrayInputStream.close();
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    MethodCollector.m26664o(7948);
                    return byteArray;
                }
            }
        } catch (IOException e) {
            mo43016q().f61827c.mo43170a("Failed to ungzip content", e);
            MethodCollector.m26664o(7948);
            throw e;
        }
    }

    /* renamed from: a */
    static List<Long> m52335a(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            long j = 0;
            int i2 = 0;
            do {
                int i3 = (i << 6) + i2;
                if (i3 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i3)) {
                    j |= 1 << i2;
                }
                i2++;
            } while (i2 < 64);
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    /* renamed from: a */
    private static List<C25802av.C25811e> m52336a(Bundle[] bundleArr) {
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : bundleArr) {
            if (bundle != null) {
                C25802av.C25811e.C25812a e = C25802av.C25811e.m49862e();
                for (String str : bundle.keySet()) {
                    C25802av.C25811e.C25812a a = C25802av.C25811e.m49862e().mo42018a(str);
                    Object a2 = m52333a(bundle, str);
                    if (a2 instanceof Long) {
                        a.mo42086a(((Long) a2).longValue());
                    } else if (a2 instanceof String) {
                        a.mo42090b((String) a2);
                    } else if (a2 instanceof Double) {
                        a.mo42085a(((Double) a2).doubleValue());
                    }
                    e.mo42087a(a);
                }
                if (e.mo42092d() > 0) {
                    arrayList.add((AbstractC25981gj) e.mo42629w());
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private static Object m52333a(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception | OutOfMemoryError unused) {
            return null;
        }
    }

    /* renamed from: a */
    static <Builder extends AbstractC26023ht> Builder m52332a(Builder builder, byte[] bArr) {
        C25965fv b = C25965fv.m50501b();
        return b != null ? (Builder) builder.mo42359a(bArr, b) : (Builder) builder.mo42358a(bArr);
    }

    /* renamed from: a */
    static int m52330a(C25802av.C25815g.C25816a aVar, String str) {
        if (aVar == null) {
            return -1;
        }
        for (int i = 0; i < aVar.mo42127f(); i++) {
            if (str.equals(aVar.mo42117c(i).zze)) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: a */
    static C25802av.C25811e m52331a(C25802av.C25807c cVar, String str) {
        for (C25802av.C25811e eVar : cVar.zzd) {
            if (eVar.zzd.equals(str)) {
                return eVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final Object mo43501b(C25802av.C25807c cVar, String str) {
        C25802av.C25811e a = m52331a(cVar, str);
        if (a != null) {
            if (a.mo42081a()) {
                return a.zze;
            }
            if (a.mo42082b()) {
                return Long.valueOf(a.zzf);
            }
            if (a.mo42083c()) {
                return Double.valueOf(a.zzh);
            }
            C26109ku.m51181b();
            if (mo43018s().mo43641d(null, C26530p.f62495aG) && a.mo42084d() > 0) {
                AbstractC25995gs<C25802av.C25811e> gsVar = a.zzi;
                ArrayList arrayList = new ArrayList();
                for (C25802av.C25811e eVar : gsVar) {
                    if (eVar != null) {
                        Bundle bundle = new Bundle();
                        for (C25802av.C25811e eVar2 : eVar.zzi) {
                            if (eVar2.mo42081a()) {
                                bundle.putString(eVar2.zzd, eVar2.zze);
                            } else if (eVar2.mo42082b()) {
                                bundle.putLong(eVar2.zzd, eVar2.zzf);
                            } else if (eVar2.mo42083c()) {
                                bundle.putDouble(eVar2.zzd, eVar2.zzh);
                            }
                        }
                        if (!bundle.isEmpty()) {
                            arrayList.add(bundle);
                        }
                    }
                }
                return arrayList.toArray(new Bundle[arrayList.size()]);
            }
        }
        return null;
    }

    /* renamed from: a */
    private static void m52337a(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
    }

    /* renamed from: a */
    private static String m52334a(boolean z, boolean z2, boolean z3) {
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append("Dynamic ");
        }
        if (z2) {
            sb.append("Sequence ");
        }
        if (z3) {
            sb.append("Session-Scoped ");
        }
        return sb.toString();
    }

    /* renamed from: a */
    private final void m52338a(StringBuilder sb, int i, C25773am.C25778c cVar) {
        if (cVar != null) {
            m52337a(sb, i);
            sb.append("filter {\n");
            if (cVar.mo42025e()) {
                m52340a(sb, i, "complement", Boolean.valueOf(cVar.zzf));
            }
            if ((cVar.zzc & 8) != 0) {
                m52340a(sb, i, "param_name", mo43013n().mo43063b(cVar.zzg));
            }
            if (cVar.mo42021a()) {
                int i2 = i + 1;
                C25773am.C25785f b = cVar.mo42022b();
                if (b != null) {
                    m52337a(sb, i2);
                    sb.append("string_filter");
                    sb.append(" {\n");
                    if (b.mo42036a()) {
                        m52340a(sb, i2, "match_type", b.mo42037b().name());
                    }
                    if (b.mo42038c()) {
                        m52340a(sb, i2, "expression", b.zze);
                    }
                    if ((b.zzc & 4) != 0) {
                        m52340a(sb, i2, "case_sensitive", Boolean.valueOf(b.zzf));
                    }
                    if (b.mo42039d() > 0) {
                        m52337a(sb, i2 + 1);
                        sb.append("expression_list {\n");
                        for (String str : b.zzg) {
                            m52337a(sb, i2 + 2);
                            sb.append(str);
                            sb.append("\n");
                        }
                        sb.append("}\n");
                    }
                    m52337a(sb, i2);
                    sb.append("}\n");
                }
            }
            if (cVar.mo42023c()) {
                m52339a(sb, i + 1, "number_filter", cVar.mo42024d());
            }
            m52337a(sb, i);
            sb.append("}\n");
        }
    }
}

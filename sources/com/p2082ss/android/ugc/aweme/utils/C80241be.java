package com.p2082ss.android.ugc.aweme.utils;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.text.TextUtils;
import androidx.core.content.C0643b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.friends.model.ContactModelV2;
import com.p2082ss.android.ugc.aweme.friends.p3022ui.AbstractC51735f;
import com.p2082ss.android.ugc.aweme.p2440ce.C35444b;
import com.p2082ss.android.ugc.aweme.social.monitor.AbstractC74739d;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: com.ss.android.ugc.aweme.utils.be */
public final class C80241be {

    /* renamed from: a */
    public static final String[] f179723a = {"android.permission.READ_CONTACTS"};

    static {
        Covode.recordClassIndex(93509);
    }

    /* renamed from: a */
    public static boolean m139079a(Context context) {
        if (C0643b.m2367a(context, "android.permission.READ_CONTACTS") != -1) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m139078a(Activity activity, AbstractC51735f fVar) {
        C35444b.m72473a(activity, new String[]{"android.permission.READ_CONTACTS"}, new C80242bf(fVar, activity));
    }

    /* renamed from: a */
    private static int[] m139080a(String[] strArr, int[] iArr) {
        if (strArr == null || iArr == null) {
            return null;
        }
        int min = Math.min(strArr.length, iArr.length);
        int[] iArr2 = new int[min];
        int i = 0;
        for (int i2 = 0; i2 < min; i2++) {
            iArr2[i2] = i;
            i += iArr[i2];
        }
        return iArr2;
    }

    /* renamed from: a */
    public static List<ContactModelV2> m139077a(Context context, AbstractC74739d dVar, boolean z) {
        return m139076a(context, dVar, null, false, z, false).f179720a;
    }

    /* renamed from: b */
    private static C80240bd m139081b(Context context, AbstractC74739d dVar, String str, boolean z, boolean z2, boolean z3) {
        int[] iArr;
        MethodCollector.m26663i(13572);
        C80240bd bdVar = new C80240bd();
        ContentResolver contentResolver = context.getContentResolver();
        Uri uri = ContactsContract.Data.CONTENT_URI;
        if (z && Build.VERSION.SDK_INT >= 21) {
            uri = uri.buildUpon().appendQueryParameter("android.provider.extra.ADDRESS_BOOK_INDEX", "true").build();
        }
        Cursor query = contentResolver.query(uri, null, null, null, str);
        if (query == null) {
            MethodCollector.m26664o(13572);
            return bdVar;
        } else if (query.getCount() == 0) {
            query.close();
            MethodCollector.m26664o(13572);
            return bdVar;
        } else {
            TreeMap treeMap = new TreeMap();
            String[] strArr = null;
            int i = 0;
            Exception e = null;
            int i2 = 0;
            while (query.moveToNext() && (!z2 || treeMap.size() != 300)) {
                try {
                    String string = query.getString(query.getColumnIndex("contact_id"));
                    ContactModelV2 contactModelV2 = (ContactModelV2) treeMap.get(string);
                    if (contactModelV2 == null) {
                        contactModelV2 = new ContactModelV2();
                        contactModelV2.phoneNumber = new ArrayList();
                        treeMap.put(string, contactModelV2);
                    }
                    if (contactModelV2.name == null) {
                        contactModelV2.name = query.getString(query.getColumnIndex("display_name"));
                    }
                    String string2 = query.getString(query.getColumnIndex("mimetype"));
                    if (!TextUtils.isEmpty(string2)) {
                        int hashCode = string2.hashCode();
                        if (hashCode != 684173810) {
                            if (hashCode == 905843021) {
                                if (string2.equals("vnd.android.cursor.item/photo") && z3) {
                                    try {
                                        contactModelV2.photoUri = query.getString(query.getColumnIndex("photo_thumb_uri"));
                                    } catch (Exception unused) {
                                    }
                                }
                            }
                        } else if (string2.equals("vnd.android.cursor.item/phone_v2")) {
                            String string3 = query.getString(query.getColumnIndex("data1"));
                            if (!TextUtils.isEmpty(string3)) {
                                String a = C80465fx.m139468a(string3);
                                List<String> list = contactModelV2.phoneNumber;
                                if (!list.contains(a)) {
                                    list.add(a);
                                }
                            }
                        }
                    }
                } catch (Exception e2) {
                    e = e2;
                    i2++;
                }
            }
            Bundle extras = query.getExtras();
            if (Build.VERSION.SDK_INT < 21 || !extras.containsKey("android.provider.extra.ADDRESS_BOOK_INDEX_TITLES") || !extras.containsKey("android.provider.extra.ADDRESS_BOOK_INDEX_COUNTS")) {
                iArr = null;
            } else {
                strArr = extras.getStringArray("android.provider.extra.ADDRESS_BOOK_INDEX_TITLES");
                iArr = extras.getIntArray("android.provider.extra.ADDRESS_BOOK_INDEX_COUNTS");
                bdVar.f179721b = strArr;
                bdVar.f179722c = iArr;
            }
            int[] a2 = m139080a(strArr, iArr);
            ArrayList arrayList = new ArrayList();
            int i3 = 0;
            for (Map.Entry entry : treeMap.entrySet()) {
                ContactModelV2 contactModelV22 = (ContactModelV2) entry.getValue();
                if (a2 != null) {
                    int i4 = i + 1;
                    if (a2.length <= i4 || i3 < a2[i4]) {
                        contactModelV22.section = bdVar.f179721b[i];
                    } else {
                        if (bdVar.f179721b.length > i4) {
                            contactModelV22.section = bdVar.f179721b[i4];
                        }
                        i = i4;
                    }
                }
                i3++;
                arrayList.add(contactModelV22);
            }
            bdVar.f179720a = arrayList;
            query.close();
            if (dVar != null) {
                if (i2 > 0) {
                    dVar.mo117785a(true, i2, e);
                }
                dVar.mo117784a(true, bdVar.f179720a.size());
            }
            MethodCollector.m26664o(13572);
            return bdVar;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0241, code lost:
        r6 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x024d, code lost:
        r12.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0252, code lost:
        r10 = r17 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0255, code lost:
        if (r1.length <= r10) goto L_0x025b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x025b, code lost:
        r5.section = r0.f179721b[r17];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x026b, code lost:
        if (r0.f179721b.length > r10) goto L_0x026d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x026d, code lost:
        r5.section = r0.f179721b[r10];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0273, code lost:
        r17 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0289, code lost:
        r4 = th;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x024d  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0252  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x0289 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:47:0x0121] */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x028c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.p2082ss.android.ugc.aweme.utils.C80240bd m139076a(android.content.Context r23, com.p2082ss.android.ugc.aweme.social.monitor.AbstractC74739d r24, java.lang.String r25, boolean r26, boolean r27, boolean r28) {
        /*
        // Method dump skipped, instructions count: 728
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.utils.C80241be.m139076a(android.content.Context, com.ss.android.ugc.aweme.social.monitor.d, java.lang.String, boolean, boolean, boolean):com.ss.android.ugc.aweme.utils.bd");
    }
}

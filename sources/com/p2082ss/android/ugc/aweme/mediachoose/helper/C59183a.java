package com.p2082ss.android.ugc.aweme.mediachoose.helper;

import android.content.Context;
import android.database.Cursor;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.tools.utils.C84892d;
import com.p2082ss.android.ugc.tools.utils.C84896h;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p078c.p080b.C1757e;
import p078c.p080b.C1758f;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89350l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.mediachoose.helper.a */
public final class C59183a {

    /* renamed from: a */
    public static boolean f134681a;

    /* renamed from: b */
    public static final C59183a f134682b = new C59183a();

    private C59183a() {
    }

    /* renamed from: com.ss.android.ugc.aweme.mediachoose.helper.a$a */
    public static final class C59184a {

        /* renamed from: a */
        public final String f134683a;

        /* renamed from: b */
        public final long f134684b;

        /* renamed from: c */
        public final long f134685c;

        /* renamed from: d */
        public final String f134686d;

        /* renamed from: e */
        public final String f134687e;

        /* renamed from: f */
        public final String[] f134688f;

        static {
            Covode.recordClassIndex(69543);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C59184a)) {
                return false;
            }
            C59184a aVar = (C59184a) obj;
            return C89219l.m154714a(this.f134683a, aVar.f134683a) && this.f134684b == aVar.f134684b && this.f134685c == aVar.f134685c && C89219l.m154714a(this.f134686d, aVar.f134686d) && C89219l.m154714a(this.f134687e, aVar.f134687e) && C89219l.m154714a(this.f134688f, aVar.f134688f);
        }

        public final int hashCode() {
            String str = this.f134683a;
            int i = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            long j = this.f134684b;
            long j2 = this.f134685c;
            int i2 = ((((hashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
            String str2 = this.f134686d;
            int hashCode2 = (i2 + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f134687e;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String[] strArr = this.f134688f;
            if (strArr != null) {
                i = Arrays.hashCode(strArr);
            }
            return hashCode3 + i;
        }

        public final String toString() {
            return "MediaQueryParams(selectAlbumPath=" + this.f134683a + ", startTime=" + this.f134684b + ", endTime=" + this.f134685c + ", order=" + this.f134686d + ", selection=" + this.f134687e + ", selectionArgs=" + Arrays.toString(this.f134688f) + ")";
        }

        private /* synthetic */ C59184a() {
            this("DESC");
        }

        private C59184a(String str) {
            C89219l.m154721d(str, "");
            this.f134683a = null;
            this.f134684b = -1;
            this.f134685c = -1;
            this.f134686d = str;
            this.f134687e = null;
            this.f134688f = null;
        }
    }

    static {
        Covode.recordClassIndex(69542);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.mediachoose.helper.a$b */
    public static final class C59185b {

        /* renamed from: a */
        public String f134689a = "DESC";

        /* renamed from: b */
        public String f134690b = "";

        /* renamed from: c */
        public String f134691c;

        /* renamed from: d */
        public List<String> f134692d = new ArrayList();

        static {
            Covode.recordClassIndex(69544);
        }

        /* renamed from: a */
        public final void mo96687a(String str) {
            C89219l.m154721d(str, "");
            this.f134689a = str;
        }

        /* renamed from: b */
        public final void mo96689b(String str) {
            C89219l.m154721d(str, "");
            this.f134690b = str;
        }

        /* renamed from: a */
        public final void mo96688a(List<String> list) {
            C89219l.m154721d(list, "");
            this.f134692d = list;
        }
    }

    /* renamed from: a */
    static C59185b m108679a(C59184a aVar, int i, int i2) {
        String concat = "date_modified ".concat("DESC");
        String str = " LIMIT " + i2 + " OFFSET " + (i * i2);
        ArrayList arrayList = new ArrayList();
        String str2 = null;
        if (!TextUtils.isEmpty(null)) {
            arrayList.add("%" + ((String) null) + '%');
            str2 = "_data like ?";
        }
        C59185b bVar = new C59185b();
        bVar.mo96687a(concat);
        bVar.mo96689b(str);
        bVar.f134691c = str2;
        bVar.mo96688a(arrayList);
        return bVar;
    }

    /* renamed from: a */
    public static final List<MediaModel> m108680a(Context context, int i, int i2) {
        List<MediaModel> b;
        C89219l.m154721d(context, "");
        String[] strArr = null;
        C59185b a = m108679a((C59184a) null, i2, i);
        if (a.f134692d.size() > 0) {
            Object[] array = a.f134692d.toArray(new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            strArr = (String[]) array;
        }
        if (i == -1) {
            if (C84896h.f189732b) {
                b = m108685b(context, a.f134691c, strArr, a.f134689a, -1, -1);
            } else {
                b = m108684b(context, a.f134691c, strArr, a.f134689a);
            }
        } else if (C84896h.f189732b) {
            b = m108685b(context, a.f134691c, strArr, a.f134689a, i, i2 * i);
        } else {
            b = m108684b(context, a.f134691c, strArr, a.f134689a + a.f134690b);
        }
        C84896h.m145861a("FileAdapterAndroidR video media list:" + b.size() + "," + C84896h.f189732b + ", trace:" + Log.getStackTraceString(new Throwable()));
        return b;
    }

    /* renamed from: a */
    static List<MediaModel> m108681a(Context context, String str, String[] strArr, String str2) {
        String str3;
        boolean z;
        MethodCollector.m26663i(9888);
        ArrayList arrayList = new ArrayList();
        String[] strArr2 = {"_id", "_data", "date_modified", "mime_type", "_size", "_data", "date_modified", "width", "height"};
        Cursor cursor = null;
        try {
            Cursor query = context.getContentResolver().query(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, strArr2, str, strArr, str2);
            if (query == null) {
                MethodCollector.m26664o(9888);
                return arrayList;
            }
            while (query.moveToNext()) {
                long j = query.getLong(0);
                String string = query.getString(1);
                long j2 = query.getLong(2);
                String string2 = query.getString(3);
                long j3 = query.getLong(4);
                String string3 = query.getString(5);
                long j4 = (long) query.getInt(6);
                int i = query.getInt(7);
                int i2 = query.getInt(8);
                if (j3 > 0) {
                    MediaModel mediaModel = new MediaModel(j);
                    mediaModel.f134662b = string;
                    mediaModel.f134663c = string;
                    mediaModel.f134666f = j2;
                    mediaModel.f134669i = j3;
                    mediaModel.f134671k = string3;
                    mediaModel.f134674n = j4;
                    if (f134681a) {
                        mediaModel.f134672l = i;
                        mediaModel.f134673m = i2;
                    }
                    try {
                        C89219l.m154716b(string, "");
                        String str4 = File.separator;
                        C89219l.m154716b(str4, "");
                        List<String> split = new C89350l(str4).split(string, 0);
                        ArrayList arrayList2 = new ArrayList();
                        for (T t : split) {
                            if (t.length() > 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z) {
                                arrayList2.add(t);
                            }
                        }
                        ArrayList arrayList3 = arrayList2;
                        if (!arrayList3.isEmpty()) {
                            str3 = (String) arrayList3.get(arrayList3.size() - 1);
                            mediaModel.f134665e = str3;
                            if (string2 != null || !C89361p.m154929e((CharSequence) string2, (CharSequence) "gif")) {
                                mediaModel.f134667g = 1;
                                if (!f134681a || mediaModel.f134672l <= 0 || mediaModel.f134673m <= 0) {
                                    C89219l.m154716b(string, "");
                                    BitmapFactory.Options options = new BitmapFactory.Options();
                                    options.inJustDecodeBounds = true;
                                    C84896h.m145856a(string, options);
                                    Pair pair = new Pair(Integer.valueOf(options.outWidth), Integer.valueOf(options.outHeight));
                                    Object obj = pair.first;
                                    C89219l.m154716b(obj, "");
                                    mediaModel.f134672l = ((Number) obj).intValue();
                                    Object obj2 = pair.second;
                                    C89219l.m154716b(obj2, "");
                                    mediaModel.f134673m = ((Number) obj2).intValue();
                                }
                            } else {
                                int i3 = Build.VERSION.SDK_INT;
                                mediaModel.f134667g = 2;
                            }
                            arrayList.add(mediaModel);
                        }
                    } catch (Exception unused) {
                    }
                    str3 = "";
                    mediaModel.f134665e = str3;
                    if (string2 != null) {
                    }
                    mediaModel.f134667g = 1;
                    C89219l.m154716b(string, "");
                    BitmapFactory.Options options2 = new BitmapFactory.Options();
                    options2.inJustDecodeBounds = true;
                    C84896h.m145856a(string, options2);
                    Pair pair2 = new Pair(Integer.valueOf(options2.outWidth), Integer.valueOf(options2.outHeight));
                    Object obj3 = pair2.first;
                    C89219l.m154716b(obj3, "");
                    mediaModel.f134672l = ((Number) obj3).intValue();
                    Object obj22 = pair2.second;
                    C89219l.m154716b(obj22, "");
                    mediaModel.f134673m = ((Number) obj22).intValue();
                    arrayList.add(mediaModel);
                }
            }
            query.close();
            MethodCollector.m26664o(9888);
            return arrayList;
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            MethodCollector.m26664o(9888);
            throw th;
        }
    }

    /* renamed from: b */
    private static List<MediaModel> m108684b(Context context, String str, String[] strArr, String str2) {
        String str3;
        boolean z;
        MethodCollector.m26663i(9891);
        ArrayList arrayList = new ArrayList();
        String[] strArr2 = {"_id", "_data", "date_modified", "mime_type", "duration", "_size", "_data", "width", "height"};
        Cursor cursor = null;
        try {
            Cursor query = context.getContentResolver().query(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, strArr2, str, strArr, str2);
            if (query == null) {
                MethodCollector.m26664o(9891);
                return arrayList;
            }
            while (query.moveToNext()) {
                long j = query.getLong(0);
                String string = query.getString(1);
                long j2 = query.getLong(2);
                String string2 = query.getString(3);
                long j3 = query.getLong(4);
                long j4 = query.getLong(5);
                String string3 = query.getString(6);
                int i = query.getInt(7);
                int i2 = query.getInt(8);
                if (!TextUtils.isEmpty(string) && j3 > 0 && j4 > 0) {
                    MediaModel mediaModel = new MediaModel(j);
                    mediaModel.f134662b = string;
                    mediaModel.f134663c = string;
                    mediaModel.f134666f = j2;
                    mediaModel.f134670j = string2;
                    mediaModel.f134668h = j3;
                    mediaModel.f134669i = j4;
                    mediaModel.f134667g = 4;
                    mediaModel.f134671k = string3;
                    mediaModel.f134672l = i;
                    mediaModel.f134673m = i2;
                    try {
                        C89219l.m154716b(string, "");
                        String str4 = File.separator;
                        C89219l.m154716b(str4, "");
                        List<String> split = new C89350l(str4).split(string, 0);
                        ArrayList arrayList2 = new ArrayList();
                        for (T t : split) {
                            if (t.length() > 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z) {
                                arrayList2.add(t);
                            }
                        }
                        ArrayList arrayList3 = arrayList2;
                        if (!arrayList3.isEmpty()) {
                            str3 = (String) arrayList3.get(arrayList3.size() - 1);
                            mediaModel.f134665e = str3;
                            arrayList.add(mediaModel);
                        }
                    } catch (Exception unused) {
                    }
                    str3 = "";
                    mediaModel.f134665e = str3;
                    arrayList.add(mediaModel);
                }
            }
            query.close();
            MethodCollector.m26664o(9891);
            return arrayList;
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            MethodCollector.m26664o(9891);
            throw th;
        }
    }

    /* renamed from: a */
    public static final List<MediaModel> m108683a(Context context, boolean z, int i, int i2) {
        List<MediaModel> a;
        boolean z2;
        C89219l.m154721d(context, "");
        String[] strArr = null;
        C59185b a2 = m108679a((C59184a) null, i2, i);
        if (!z) {
            String str = a2.f134691c;
            if (str == null || str.length() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            String str2 = "mime_type not like ?";
            if (!z2) {
                String str3 = a2.f134691c;
                if (str3 != null) {
                    str2 = C59186b.m108689a(str3, str2);
                } else {
                    str2 = null;
                }
            }
            a2.f134691c = str2;
            a2.f134692d.add("%gif%");
        }
        if (a2.f134692d.size() > 0) {
            Object[] array = a2.f134692d.toArray(new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            strArr = (String[]) array;
        }
        if (i <= 0) {
            if (C84896h.f189732b) {
                a = m108682a(context, a2.f134691c, strArr, a2.f134689a, -1, -1);
            } else {
                a = m108681a(context, a2.f134691c, strArr, a2.f134689a);
            }
        } else if (C84896h.f189732b) {
            a = m108682a(context, a2.f134691c, strArr, a2.f134689a, i, i2 * i);
        } else {
            a = m108681a(context, a2.f134691c, strArr, a2.f134689a + a2.f134690b);
        }
        C84896h.m145861a("FileAdapterAndroidR image media list:" + a.size() + "," + C84896h.f189732b + ", trace:" + Log.getStackTraceString(new Throwable()));
        return a;
    }

    /* renamed from: b */
    private static List<MediaModel> m108685b(Context context, String str, String[] strArr, String str2, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        List<C1758f> a = C1757e.m5904a(context, str, strArr, str2, i, i2);
        if (C84892d.m145850a(a)) {
            return arrayList;
        }
        for (C1758f fVar : a) {
            String str3 = "";
            C89219l.m154716b(fVar, str3);
            if (fVar.f5642g > 0) {
                MediaModel mediaModel = new MediaModel(fVar.f5636a);
                mediaModel.f134662b = fVar.f5646k.toString();
                mediaModel.f134663c = fVar.f5647l;
                mediaModel.f134664d = fVar.f5637b;
                mediaModel.f134666f = fVar.f5639d;
                mediaModel.f134669i = fVar.f5642g;
                mediaModel.f134674n = fVar.f5638c;
                mediaModel.f134670j = fVar.f5640e;
                mediaModel.f134672l = fVar.f5643h;
                mediaModel.f134673m = fVar.f5644i;
                mediaModel.f134668h = fVar.f5641f;
                mediaModel.f134667g = 4;
                if (!TextUtils.isEmpty(mediaModel.f134663c)) {
                    try {
                        String str4 = mediaModel.f134663c;
                        C89219l.m154716b(str4, str3);
                        String str5 = File.separator;
                        C89219l.m154716b(str5, str3);
                        List<String> split = new C89350l(str5).split(str4, 0);
                        ArrayList arrayList2 = new ArrayList();
                        Iterator<T> it = split.iterator();
                        while (true) {
                            boolean z = true;
                            if (!it.hasNext()) {
                                break;
                            }
                            T next = it.next();
                            if (next.length() <= 0) {
                                z = false;
                            }
                            if (z) {
                                arrayList2.add(next);
                            }
                        }
                        ArrayList arrayList3 = arrayList2;
                        if (!arrayList3.isEmpty()) {
                            str3 = (String) arrayList3.get(arrayList3.size() - 1);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                        C84896h.m145861a("MediaHelper ===> image ablum exception :" + C84896h.f189732b + ", trace:" + Log.getStackTraceString(e));
                    }
                    mediaModel.f134665e = str3;
                }
                arrayList.add(mediaModel);
            }
        }
        return arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0081 A[SYNTHETIC, Splitter:B:18:0x0081] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static java.util.List<com.p2082ss.android.ugc.aweme.mediachoose.helper.MediaModel> m108682a(android.content.Context r11, java.lang.String r12, java.lang.String[] r13, java.lang.String r14, int r15, int r16) {
        /*
        // Method dump skipped, instructions count: 258
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.mediachoose.helper.C59183a.m108682a(android.content.Context, java.lang.String, java.lang.String[], java.lang.String, int, int):java.util.List");
    }
}

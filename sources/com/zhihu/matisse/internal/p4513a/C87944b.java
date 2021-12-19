package com.zhihu.matisse.internal.p4513a;

import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.database.MergeCursor;
import android.net.Uri;
import android.provider.MediaStore;
import androidx.loader.p062a.C1231b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;

/* renamed from: com.zhihu.matisse.internal.a.b */
public final class C87944b extends C1231b {

    /* renamed from: v */
    public static final String[] f199711v = {"1", "3"};

    /* renamed from: w */
    private static final Uri f199712w = MediaStore.Files.getContentUri("external");

    /* renamed from: x */
    private static final String[] f199713x = {"_id", "_display_name", "mime_type", "_size", "duration"};

    /* renamed from: y */
    private final boolean f199714y;

    @Override // androidx.loader.p062a.C1232c
    /* renamed from: o */
    public final void mo4084o() {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // androidx.loader.p062a.C1231b, androidx.loader.p062a.AbstractC1229a
    /* renamed from: d */
    public final /* synthetic */ Cursor mo4067d() {
        return mo4067d();
    }

    static {
        Covode.recordClassIndex(103959);
    }

    @Override // androidx.loader.p062a.C1231b
    /* renamed from: f */
    public final Cursor mo4074f() {
        Cursor f = super.mo4067d();
        if (this.f199714y) {
            Context applicationContext = this.f4050p.getApplicationContext();
            if (C58003a.f132201c && applicationContext == null) {
                applicationContext = C58003a.f132199a;
            }
            if (applicationContext.getPackageManager().hasSystemFeature("android.hardware.camera")) {
                MatrixCursor matrixCursor = new MatrixCursor(f199713x);
                matrixCursor.addRow(new Object[]{-1L, "Capture", "", 0, 0});
                return new MergeCursor(new Cursor[]{matrixCursor, f});
            }
        }
        return f;
    }

    /* renamed from: a */
    public static String[] m152964a(int i) {
        return new String[]{String.valueOf(i)};
    }

    /* renamed from: a */
    public static String[] m152965a(int i, String str) {
        return new String[]{String.valueOf(i), str};
    }

    public C87944b(Context context, String str, String[] strArr, boolean z) {
        super(context, f199712w, f199713x, str, strArr, "datetaken DESC");
        this.f199714y = z;
    }
}

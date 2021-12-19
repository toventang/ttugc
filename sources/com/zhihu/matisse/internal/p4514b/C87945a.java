package com.zhihu.matisse.internal.p4514b;

import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.os.Bundle;
import androidx.loader.app.AbstractC1247a;
import androidx.loader.p062a.C1232c;
import com.bytedance.covode.number.Covode;
import com.zhihu.matisse.internal.entity.C87956c;
import com.zhihu.matisse.internal.p4513a.C87943a;
import java.lang.ref.WeakReference;

/* renamed from: com.zhihu.matisse.internal.b.a */
public final class C87945a implements AbstractC1247a.AbstractC1248a<Cursor> {

    /* renamed from: a */
    public WeakReference<Context> f199715a;

    /* renamed from: b */
    public AbstractC1247a f199716b;

    /* renamed from: c */
    public AbstractC87946a f199717c;

    /* renamed from: d */
    public int f199718d;

    /* renamed from: e */
    private boolean f199719e;

    /* renamed from: com.zhihu.matisse.internal.b.a$a */
    public interface AbstractC87946a {
        static {
            Covode.recordClassIndex(103961);
        }

        /* renamed from: a */
        void mo142447a();

        /* renamed from: a */
        void mo142448a(Cursor cursor);
    }

    static {
        Covode.recordClassIndex(103960);
    }

    @Override // androidx.loader.app.AbstractC1247a.AbstractC1248a
    /* renamed from: a */
    public final void mo4110a() {
        if (this.f199715a.get() != null) {
            this.f199717c.mo142447a();
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.loader.app.AbstractC1247a.AbstractC1248a
    /* renamed from: a */
    public final /* synthetic */ void mo4111a(Cursor cursor) {
        Cursor cursor2 = cursor;
        if (this.f199715a.get() != null && !this.f199719e) {
            this.f199719e = true;
            this.f199717c.mo142448a(cursor2);
        }
    }

    @Override // androidx.loader.app.AbstractC1247a.AbstractC1248a
    /* renamed from: a */
    public final C1232c<Cursor> mo4109a(Bundle bundle) {
        String[] strArr;
        Context context = this.f199715a.get();
        if (context == null) {
            return null;
        }
        this.f199719e = false;
        String str = "media_type=? AND _size>0) GROUP BY (bucket_id";
        if (C87956c.C87957a.f199768a.mo142485c()) {
            if (Build.VERSION.SDK_INT >= 29) {
                str = "media_type=? AND _size>0";
            }
            strArr = C87943a.m152960a(1);
        } else if (C87956c.C87957a.f199768a.mo142486d()) {
            if (Build.VERSION.SDK_INT >= 29) {
                str = "media_type=? AND _size>0";
            }
            strArr = C87943a.m152960a(3);
        } else {
            if (Build.VERSION.SDK_INT < 29) {
                str = "(media_type=? OR media_type=?) AND _size>0) GROUP BY (bucket_id";
            } else {
                str = "(media_type=? OR media_type=?) AND _size>0";
            }
            strArr = C87943a.f199706v;
        }
        return new C87943a(context, str, strArr);
    }
}

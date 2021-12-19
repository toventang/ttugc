package com.zhihu.matisse.internal.p4514b;

import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import androidx.fragment.app.ActivityC0945e;
import androidx.loader.app.AbstractC1247a;
import androidx.loader.p062a.C1232c;
import com.bytedance.covode.number.Covode;
import com.zhihu.matisse.internal.entity.Album;
import com.zhihu.matisse.internal.entity.C87956c;
import com.zhihu.matisse.internal.p4513a.C87944b;
import java.lang.ref.WeakReference;

/* renamed from: com.zhihu.matisse.internal.b.b */
public final class C87947b implements AbstractC1247a.AbstractC1248a<Cursor> {

    /* renamed from: a */
    private WeakReference<Context> f199720a;

    /* renamed from: b */
    private AbstractC1247a f199721b;

    /* renamed from: c */
    private AbstractC87948a f199722c;

    /* renamed from: com.zhihu.matisse.internal.b.b$a */
    public interface AbstractC87948a {
        static {
            Covode.recordClassIndex(103963);
        }

        /* renamed from: a */
        void mo142452a();

        /* renamed from: a */
        void mo142453a(Cursor cursor);
    }

    static {
        Covode.recordClassIndex(103962);
    }

    @Override // androidx.loader.app.AbstractC1247a.AbstractC1248a
    /* renamed from: a */
    public final void mo4110a() {
        if (this.f199720a.get() != null) {
            this.f199722c.mo142452a();
        }
    }

    /* renamed from: b */
    public final void mo142451b() {
        AbstractC1247a aVar = this.f199721b;
        if (aVar != null) {
            aVar.mo4099a(2);
        }
        this.f199722c = null;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.loader.app.AbstractC1247a.AbstractC1248a
    /* renamed from: a */
    public final /* synthetic */ void mo4111a(Cursor cursor) {
        Cursor cursor2 = cursor;
        if (this.f199720a.get() != null) {
            this.f199722c.mo142453a(cursor2);
        }
    }

    @Override // androidx.loader.app.AbstractC1247a.AbstractC1248a
    /* renamed from: a */
    public final C1232c<Cursor> mo4109a(Bundle bundle) {
        Album album;
        boolean z;
        String[] strArr;
        Context context = this.f199720a.get();
        if (context == null || (album = (Album) bundle.getParcelable("args_album")) == null) {
            return null;
        }
        boolean z2 = false;
        if (!album.mo142468b() || !bundle.getBoolean("args_enable_capture", false)) {
            z = false;
        } else {
            z = true;
        }
        String str = "media_type=? AND _size>0";
        if (album.mo142468b()) {
            if (C87956c.C87957a.f199768a.mo142485c()) {
                strArr = C87944b.m152964a(1);
            } else if (C87956c.C87957a.f199768a.mo142486d()) {
                strArr = C87944b.m152964a(3);
            } else {
                strArr = C87944b.f199711v;
                str = "(media_type=? OR media_type=?) AND _size>0";
            }
            z2 = z;
        } else {
            str = "media_type=? AND  bucket_id=? AND _size>0";
            if (C87956c.C87957a.f199768a.mo142485c()) {
                strArr = C87944b.m152965a(1, album.f199732b);
            } else if (C87956c.C87957a.f199768a.mo142486d()) {
                strArr = C87944b.m152965a(3, album.f199732b);
            } else {
                strArr = new String[]{"1", "3", album.f199732b};
                str = "(media_type=? OR media_type=?) AND  bucket_id=? AND _size>0";
            }
        }
        return new C87944b(context, str, strArr, z2);
    }

    /* renamed from: a */
    public final void mo142449a(ActivityC0945e eVar, AbstractC87948a aVar) {
        this.f199720a = new WeakReference<>(eVar);
        this.f199721b = eVar.getSupportLoaderManager();
        this.f199722c = aVar;
    }

    /* renamed from: a */
    public final void mo142450a(Album album, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("args_album", album);
        bundle.putBoolean("args_enable_capture", z);
        this.f199721b.mo4097a(2, bundle, this);
    }
}

package com.zhihu.matisse.internal.p4516ui.p4517a;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.TextView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.facebook.drawee.p1855f.C24246a;
import com.facebook.drawee.p1855f.C24247b;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.common.C24363d;
import com.facebook.imagepipeline.p1890o.C24636b;
import com.facebook.imagepipeline.p1890o.C24639c;
import com.p2082ss.android.ugc.trill.R;
import com.zhihu.matisse.internal.entity.Album;

/* renamed from: com.zhihu.matisse.internal.ui.a.b */
public final class C87968b extends CursorAdapter {

    /* renamed from: a */
    private final Drawable f199798a;

    static {
        Covode.recordClassIndex(103987);
    }

    public C87968b(Context context) {
        super(context, (Cursor) null, false);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.i2});
        this.f199798a = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
    }

    public final View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
        return C1764a.m5927a(LayoutInflater.from(context), R.layout.cn, viewGroup, false);
    }

    public final void bindView(View view, Context context, Cursor cursor) {
        Album a = Album.m152999a(cursor);
        ((TextView) view.findViewById(R.id.hz)).setText(a.mo142466a(context));
        ((TextView) view.findViewById(R.id.hy)).setText(String.valueOf(a.f199734d));
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) view.findViewById(R.id.hw);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.ok);
        C24639c a2 = C24639c.m47149a(a.f199733c);
        a2.f58553d = new C24363d(dimensionPixelSize, dimensionPixelSize);
        C24636b a3 = a2.mo40483a();
        C24246a aVar = (C24246a) simpleDraweeView.getHierarchy();
        if (aVar == null) {
            aVar = new C24247b(context.getResources()).mo39973a();
        }
        aVar.mo39953a(1, this.f199798a);
        simpleDraweeView.setHierarchy(aVar);
        simpleDraweeView.setImageRequest(a3);
    }
}

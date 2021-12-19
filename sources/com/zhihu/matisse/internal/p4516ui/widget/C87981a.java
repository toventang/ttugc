package com.zhihu.matisse.internal.p4516ui.widget;

import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.os.Build;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CursorAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.C0381aa;
import com.bytedance.covode.number.Covode;
import com.bytedance.sysoptimizer.java.ResourcesProtector;
import com.p2082ss.android.ugc.trill.R;
import com.zhihu.matisse.internal.entity.Album;

/* renamed from: com.zhihu.matisse.internal.ui.widget.a */
public final class C87981a {

    /* renamed from: a */
    public CursorAdapter f199842a;

    /* renamed from: b */
    public TextView f199843b;

    /* renamed from: c */
    public C0381aa f199844c;

    /* renamed from: d */
    public AdapterView.OnItemSelectedListener f199845d;

    static {
        Covode.recordClassIndex(104006);
    }

    public C87981a(Context context) {
        C0381aa aaVar = new C0381aa(context, null, R.attr.a2r);
        this.f199844c = aaVar;
        aaVar.mo1711b();
        float f = context.getResources().getDisplayMetrics().density;
        this.f199844c.mo1712b((int) (216.0f * f));
        this.f199844c.f1486h = (int) (16.0f * f);
        this.f199844c.mo1707a((int) (f * -48.0f));
        this.f199844c.f1495q = new AdapterView.OnItemClickListener() {
            /* class com.zhihu.matisse.internal.p4516ui.widget.C87981a.C879821 */

            static {
                Covode.recordClassIndex(104007);
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                C87981a.this.mo142534a(adapterView.getContext(), i);
                if (C87981a.this.f199845d != null) {
                    C87981a.this.f199845d.onItemSelected(adapterView, view, i, j);
                }
            }
        };
    }

    /* renamed from: a */
    private static int m153049a(Resources resources) {
        ResourcesProtector.Config matchConfig = ResourcesProtector.getMatchConfig(17694722);
        if (matchConfig == null) {
            return resources.getInteger(17694722);
        }
        try {
            if (!matchConfig.mockCrash) {
                return resources.getInteger(17694722);
            }
            throw new Resources.NotFoundException("unknown resource from mocked");
        } catch (Throwable th) {
            StackTraceElement[] stackTrace = th.getStackTrace();
            int min = Math.min(stackTrace.length, matchConfig.mMaxStep);
            for (int i = 0; i < min; i++) {
                StackTraceElement stackTraceElement = stackTrace[i];
                if (stackTraceElement != null) {
                    if (matchConfig.mProtectClassName.equals(stackTraceElement.getClassName())) {
                        if (matchConfig.mProtectMethodName.equals(stackTraceElement.getMethodName())) {
                            return matchConfig.mReturnIdWhenException;
                        }
                    } else {
                        continue;
                    }
                }
            }
            return resources.getInteger(17694722);
        }
    }

    /* renamed from: a */
    public final void mo142534a(Context context, int i) {
        this.f199844c.mo918d();
        Cursor cursor = this.f199842a.getCursor();
        cursor.moveToPosition(i);
        String a = Album.m152999a(cursor).mo142466a(context);
        if (this.f199843b.getVisibility() == 0) {
            this.f199843b.setText(a);
            return;
        }
        int i2 = Build.VERSION.SDK_INT;
        this.f199843b.setAlpha(0.0f);
        this.f199843b.setVisibility(0);
        this.f199843b.setText(a);
        this.f199843b.animate().alpha(1.0f).setDuration((long) m153049a(context.getResources())).start();
    }
}

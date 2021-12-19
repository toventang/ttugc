package com.zhihu.matisse.internal.entity;

import android.content.Context;
import android.os.Build;
import android.widget.Toast;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.utils.C80567ic;
import com.zhihu.matisse.internal.p4516ui.widget.C87984b;

/* renamed from: com.zhihu.matisse.internal.entity.b */
public final class C87955b {

    /* renamed from: a */
    private int f199744a;

    /* renamed from: b */
    private String f199745b;

    /* renamed from: c */
    private String f199746c;

    static {
        Covode.recordClassIndex(103972);
    }

    public C87955b(String str) {
        this.f199746c = str;
    }

    public C87955b(String str, byte b) {
        this.f199744a = 1;
        this.f199746c = str;
    }

    /* renamed from: a */
    public static void m153008a(Context context, C87955b bVar) {
        if (bVar != null) {
            int i = bVar.f199744a;
            if (i == 1) {
                C87984b.m153051a(bVar.f199745b, bVar.f199746c).show(((ActivityC0945e) context).getSupportFragmentManager(), C87984b.class.getName());
            } else if (i != 2) {
                Toast makeText = Toast.makeText(context, bVar.f199746c, 0);
                if (Build.VERSION.SDK_INT == 25) {
                    C80567ic.m139657a(makeText);
                }
                makeText.show();
            }
        }
    }
}

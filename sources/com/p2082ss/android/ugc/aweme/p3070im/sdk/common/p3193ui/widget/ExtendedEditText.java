package com.p2082ss.android.ugc.aweme.p3070im.sdk.common.p3193ui.widget;

import android.content.Context;
import android.text.TextWatcher;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatEditText;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Iterator;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.common.ui.widget.ExtendedEditText */
public final class ExtendedEditText extends AppCompatEditText {

    /* renamed from: a */
    private ArrayList<TextWatcher> f126432a;

    static {
        Covode.recordClassIndex(65063);
    }

    /* renamed from: a */
    public final void mo92322a() {
        ArrayList<TextWatcher> arrayList = this.f126432a;
        if (arrayList != null) {
            Iterator<TextWatcher> it = arrayList.iterator();
            while (it.hasNext()) {
                super.removeTextChangedListener(it.next());
            }
            ArrayList<TextWatcher> arrayList2 = this.f126432a;
            if (arrayList2 == null) {
                C89219l.m154715b();
            }
            arrayList2.clear();
            this.f126432a = null;
        }
    }

    public final void addTextChangedListener(TextWatcher textWatcher) {
        C89219l.m154721d(textWatcher, "");
        if (this.f126432a == null) {
            this.f126432a = new ArrayList<>();
        }
        ArrayList<TextWatcher> arrayList = this.f126432a;
        if (arrayList == null) {
            C89219l.m154715b();
        }
        arrayList.add(textWatcher);
        super.addTextChangedListener(textWatcher);
    }

    public final void removeTextChangedListener(TextWatcher textWatcher) {
        ArrayList<TextWatcher> arrayList;
        C89219l.m154721d(textWatcher, "");
        ArrayList<TextWatcher> arrayList2 = this.f126432a;
        if (!(arrayList2 == null || arrayList2.indexOf(textWatcher) < 0 || (arrayList = this.f126432a) == null)) {
            arrayList.remove(textWatcher);
        }
        super.removeTextChangedListener(textWatcher);
    }

    public ExtendedEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}

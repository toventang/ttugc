package com.p2082ss.android.ugc.aweme.shortvideo.model;

import android.view.View;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1213t;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.model.CommonViewStatus */
public class CommonViewStatus extends AbstractC1174ac {
    public final C1213t<Float> _alpha = new C1213t<>();
    public final C1213t<Boolean> _enable = new C1213t<>();
    public final C1213t<Integer> _visibility = new C1213t<>();
    private final List<AbstractC89172b<View, C89391z>> mClickListenerList = new ArrayList();

    static {
        Covode.recordClassIndex(84566);
    }

    public final void addOnClickListener(AbstractC89172b<? super View, C89391z> bVar) {
        C89219l.m154721d(bVar, "");
        this.mClickListenerList.add(bVar);
    }

    public final void setOnClickListener(AbstractC89172b<? super View, C89391z> bVar) {
        C89219l.m154721d(bVar, "");
        this.mClickListenerList.clear();
        this.mClickListenerList.add(bVar);
    }

    public final void click(View view) {
        C89219l.m154721d(view, "");
        Iterator<T> it = this.mClickListenerList.iterator();
        while (it.hasNext()) {
            it.next().invoke(view);
        }
    }

    public void bindView(View view, AbstractC1204m mVar) {
        C89219l.m154721d(view, "");
        C89219l.m154721d(mVar, "");
        this._visibility.observe(mVar, new CommonViewStatus$bindView$1(view));
        this._alpha.observe(mVar, new CommonViewStatus$bindView$2(view));
        this._enable.observe(mVar, new CommonViewStatus$bindView$3(view));
        view.setOnClickListener(new CommonViewStatus$bindView$4(this));
    }
}

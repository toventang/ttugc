package com.bytedance.android.livesdk.chatroom.end;

import android.content.res.TypedArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p218f.C3910b;
import com.bytedance.android.livesdk.chatroom.end.TopFansLayout;
import com.bytedance.android.livesdk.chatroom.p492g.C7577g;
import com.bytedance.android.livesdk.model.C9540ax;
import com.bytedance.android.livesdk.p643ui.C10935a;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.common.utility.C13617h;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;
import java.util.Iterator;
import java.util.List;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.bytedance.android.livesdk.chatroom.end.k */
final /* synthetic */ class C7529k implements AbstractC88433f {

    /* renamed from: a */
    private final TopFansLayout f18704a;

    /* renamed from: b */
    private final C10935a f18705b;

    static {
        Covode.recordClassIndex(8301);
    }

    C7529k(TopFansLayout topFansLayout, C10935a aVar) {
        this.f18704a = topFansLayout;
        this.f18705b = aVar;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        MethodCollector.m26663i(3869);
        TopFansLayout topFansLayout = this.f18704a;
        List list = (List) obj;
        if (this.f18705b.isViewValid() && !C13617h.m24465a(list)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C9540ax axVar = (C9540ax) it.next();
                if (axVar == null || axVar.f23187a <= 0) {
                    it.remove();
                }
            }
            if (!C13617h.m24465a(list)) {
                TypedArray obtainTypedArray = topFansLayout.getContext().getResources().obtainTypedArray(R.array.aw);
                topFansLayout.f18633b.clear();
                int i = 0;
                while (true) {
                    if (i < list.size()) {
                        if (i >= obtainTypedArray.length()) {
                            break;
                        }
                        User user = ((C9540ax) list.get(i)).f23188b;
                        if (user != null) {
                            TopFansLayout.C7510b bVar = new TopFansLayout.C7510b(LayoutInflater.from(topFansLayout.getContext()).inflate(R.layout.b_f, (ViewGroup) null), (byte) 0);
                            C7577g.m15570a(bVar.f18653c, user.getAvatarThumb(), 2131234441);
                            if (user.getId() == C11115u.m19743a().mo17915b().mo13161c() || user.isFollowing() || !topFansLayout.f18642k) {
                                bVar.f18651a.setVisibility(8);
                            } else {
                                bVar.f18651a.setVisibility(0);
                            }
                            C9540ax axVar2 = (C9540ax) list.get(i);
                            axVar2.f23189c = i + 1;
                            bVar.f18651a.setTag(R.id.epo, axVar2);
                            bVar.f18651a.setOnClickListener(topFansLayout.f18643l);
                            bVar.f18653c.setBackgroundResource(obtainTypedArray.getResourceId(i, 0));
                            bVar.f18653c.setTag(R.id.epo, axVar2);
                            bVar.f18653c.setOnClickListener(topFansLayout.f18638g);
                            if (axVar2.f23188b != null) {
                                bVar.f18654d.setText(axVar2.f23188b.getNickName());
                                bVar.f18655e.setText(topFansLayout.f18635d.getResources().getString(R.string.gt7, C3910b.m9544b(axVar2.f23187a)));
                            }
                            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2);
                            layoutParams.weight = 1.0f;
                            bVar.f18652b.setLayoutParams(layoutParams);
                            topFansLayout.f18633b.add(bVar);
                            topFansLayout.addView(bVar.f18652b);
                            if (i != list.size() - 1) {
                                View view = new View(topFansLayout.f18635d);
                                view.setBackgroundResource(R.drawable.bxe);
                                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams((int) C13628n.m24520b(topFansLayout.f18635d, 0.5f), -1);
                                layoutParams2.topMargin = (int) C13628n.m24520b(topFansLayout.f18635d, 20.0f);
                                layoutParams2.bottomMargin = (int) C13628n.m24520b(topFansLayout.f18635d, 20.0f);
                                topFansLayout.addView(view, layoutParams2);
                            }
                            if (i == 0 && list.size() != 2) {
                                RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) bVar.f18653c.getLayoutParams();
                                layoutParams3.topMargin = 0;
                                layoutParams3.width = (int) C13628n.m24520b(topFansLayout.f18635d, 56.0f);
                                layoutParams3.height = (int) C13628n.m24520b(topFansLayout.f18635d, 56.0f);
                                bVar.f18654d.setTextSize(2, 14.0f);
                                ((RelativeLayout.LayoutParams) bVar.f18654d.getLayoutParams()).topMargin = (int) C13628n.m24520b(topFansLayout.f18635d, 24.0f);
                            }
                        }
                        i++;
                    } else {
                        if (list.size() == 3) {
                            int indexOfChild = topFansLayout.indexOfChild(topFansLayout.f18633b.get(1).f18652b);
                            topFansLayout.removeView(topFansLayout.f18633b.get(0).f18652b);
                            topFansLayout.removeView(topFansLayout.f18633b.get(1).f18652b);
                            topFansLayout.addView(topFansLayout.f18633b.get(1).f18652b, 0);
                            topFansLayout.addView(topFansLayout.f18633b.get(0).f18652b, indexOfChild);
                        }
                        obtainTypedArray.recycle();
                        topFansLayout.postInvalidate();
                        topFansLayout.mo13759a();
                    }
                }
            }
        }
        MethodCollector.m26664o(3869);
    }
}

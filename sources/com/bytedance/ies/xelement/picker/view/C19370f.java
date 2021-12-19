package com.bytedance.ies.xelement.picker.view;

import android.graphics.Typeface;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.picker.p1386c.C19334b;
import com.bytedance.ies.xelement.picker.p1388e.AbstractC19343g;
import com.bytedance.ies.xelement.picker.view.WheelView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.ies.xelement.picker.view.f */
public final class C19370f {

    /* renamed from: a */
    public View f45859a;

    /* renamed from: b */
    List<WheelView> f45860b = new ArrayList();

    /* renamed from: c */
    public List<List<String>> f45861c;

    /* renamed from: d */
    public List<Integer> f45862d = new ArrayList();

    /* renamed from: e */
    public AbstractC19343g f45863e;

    /* renamed from: f */
    public C19334b f45864f;

    static {
        Covode.recordClassIndex(22159);
    }

    public C19370f(View view) {
        this.f45859a = view;
    }

    /* renamed from: a */
    public final void mo30873a(float f) {
        for (WheelView wheelView : this.f45860b) {
            wheelView.setLineSpacingMultiplier(f);
        }
    }

    /* renamed from: b */
    public final void mo30879b(int i) {
        for (WheelView wheelView : this.f45860b) {
            wheelView.setItemsVisibleCount(i);
        }
    }

    /* renamed from: c */
    public final void mo30882c(int i) {
        for (WheelView wheelView : this.f45860b) {
            wheelView.setDividerColor(i);
        }
    }

    /* renamed from: d */
    public final void mo30885d(int i) {
        for (WheelView wheelView : this.f45860b) {
            wheelView.setTextColorCenter(i);
        }
    }

    /* renamed from: e */
    public final void mo30887e(int i) {
        for (WheelView wheelView : this.f45860b) {
            wheelView.setTextColorOut(i);
        }
    }

    /* renamed from: a */
    public final void mo30874a(int i) {
        for (WheelView wheelView : this.f45860b) {
            wheelView.setTextSize((float) i);
        }
    }

    /* renamed from: b */
    public final void mo30880b(List<String> list) {
        for (WheelView wheelView : this.f45860b) {
            String str = null;
            if (list != null && !list.isEmpty()) {
                str = list.remove(0);
            }
            wheelView.setLabel(str);
        }
    }

    /* renamed from: c */
    public final void mo30883c(List<Integer> list) {
        Integer remove;
        for (WheelView wheelView : this.f45860b) {
            if (!(list == null || list.isEmpty() || (remove = list.remove(0)) == null)) {
                wheelView.setTextXOffset(remove.intValue());
            }
        }
    }

    /* renamed from: d */
    public final void mo30886d(List<Boolean> list) {
        Boolean remove;
        for (WheelView wheelView : this.f45860b) {
            if (list == null || list.isEmpty() || (remove = list.remove(0)) == null) {
                wheelView.setCyclic(false);
            } else {
                wheelView.setCyclic(remove.booleanValue());
            }
        }
    }

    /* renamed from: a */
    public final void mo30875a(Typeface typeface) {
        for (WheelView wheelView : this.f45860b) {
            wheelView.setTypeface(typeface);
        }
    }

    /* renamed from: b */
    public final void mo30881b(boolean z) {
        for (WheelView wheelView : this.f45860b) {
            wheelView.setAlphaGradient(z);
        }
    }

    /* renamed from: c */
    public final void mo30884c(boolean z) {
        for (WheelView wheelView : this.f45860b) {
            wheelView.f45783b = z;
        }
    }

    /* renamed from: a */
    public final void mo30876a(WheelView.EnumC19353b bVar) {
        for (WheelView wheelView : this.f45860b) {
            wheelView.setDividerType(bVar);
        }
    }

    /* renamed from: a */
    public final void mo30877a(List<Integer> list) {
        if (this.f45861c == null) {
            this.f45862d.clear();
            return;
        }
        if (list == null) {
            list = new ArrayList<>();
            for (int i = 0; i < this.f45861c.size(); i++) {
                list.add(0);
            }
        }
        for (Integer num : list) {
            if (num == null) {
                throw new IllegalArgumentException("index can not be null");
            }
        }
        for (int i2 = 0; i2 < this.f45860b.size(); i2++) {
            WheelView wheelView = this.f45860b.get(i2);
            if (i2 < list.size()) {
                int intValue = list.get(i2).intValue();
                List<List<String>> list2 = this.f45861c;
                if (list2 == null || i2 >= list2.size() || intValue >= this.f45861c.get(i2).size()) {
                    list.set(i2, 0);
                } else {
                    wheelView.setCurrentIndex(intValue);
                }
            }
            wheelView.setCurrentIndex(0);
        }
        this.f45862d.clear();
        this.f45862d.addAll(list);
    }

    /* renamed from: a */
    public final void mo30878a(boolean z) {
        for (WheelView wheelView : this.f45860b) {
            wheelView.setCyclic(z);
        }
    }
}

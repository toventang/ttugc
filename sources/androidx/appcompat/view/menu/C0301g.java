package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.AbstractC0320p;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

/* renamed from: androidx.appcompat.view.menu.g */
public final class C0301g extends BaseAdapter {

    /* renamed from: a */
    public C0302h f1081a;

    /* renamed from: b */
    public boolean f1082b;

    /* renamed from: c */
    private int f1083c = -1;

    /* renamed from: d */
    private final boolean f1084d;

    /* renamed from: e */
    private final LayoutInflater f1085e;

    /* renamed from: f */
    private final int f1086f;

    static {
        Covode.recordClassIndex(338);
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final void notifyDataSetChanged() {
        m1089a();
        super.notifyDataSetChanged();
    }

    /* renamed from: a */
    private void m1089a() {
        C0306j jVar = this.f1081a.f1100l;
        if (jVar != null) {
            ArrayList<C0306j> k = this.f1081a.mo992k();
            int size = k.size();
            for (int i = 0; i < size; i++) {
                if (k.get(i) == jVar) {
                    this.f1083c = i;
                    return;
                }
            }
        }
        this.f1083c = -1;
    }

    public final int getCount() {
        ArrayList<C0306j> i;
        if (this.f1084d) {
            i = this.f1081a.mo992k();
        } else {
            i = this.f1081a.mo989i();
        }
        if (this.f1083c < 0) {
            return i.size();
        }
        return i.size() - 1;
    }

    /* renamed from: a */
    public final C0306j getItem(int i) {
        ArrayList<C0306j> i2;
        if (this.f1084d) {
            i2 = this.f1081a.mo992k();
        } else {
            i2 = this.f1081a.mo989i();
        }
        int i3 = this.f1083c;
        if (i3 >= 0 && i >= i3) {
            i++;
        }
        return i2.get(i);
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        int i2;
        boolean z = false;
        if (view == null) {
            view = C1764a.m5927a(this.f1085e, this.f1086f, viewGroup, false);
        }
        int groupId = getItem(i).getGroupId();
        int i3 = i - 1;
        if (i3 >= 0) {
            i2 = getItem(i3).getGroupId();
        } else {
            i2 = groupId;
        }
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f1081a.mo973b() && groupId != i2) {
            z = true;
        }
        listMenuItemView.setGroupDividerEnabled(z);
        AbstractC0320p.AbstractC0321a aVar = (AbstractC0320p.AbstractC0321a) view;
        if (this.f1082b) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.mo795a(getItem(i));
        return view;
    }

    public C0301g(C0302h hVar, LayoutInflater layoutInflater, boolean z, int i) {
        this.f1084d = z;
        this.f1085e = layoutInflater;
        this.f1081a = hVar;
        this.f1086f = i;
        m1089a();
    }
}

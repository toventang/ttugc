package com.p2082ss.android.ugc.aweme.profile.p3576ui;

import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.AbstractC0974l;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a;
import com.p2082ss.android.ugc.aweme.base.utils.C34722h;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.cn */
public class C64117cn<T extends AbstractC34586a> extends AbstractC0974l {

    /* renamed from: b */
    public List<T> f145456b;

    /* renamed from: c */
    public List<Integer> f145457c;

    static {
        Covode.recordClassIndex(75561);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return this.f145456b.size();
    }

    /* renamed from: b */
    public final Fragment mo103729b() {
        int indexOf = this.f145457c.indexOf(0);
        if (indexOf < 0 || indexOf >= this.f145456b.size()) {
            return null;
        }
        return this.f145456b.get(indexOf);
    }

    public C64117cn(AbstractC0952i iVar) {
        super(iVar);
    }

    @Override // androidx.fragment.app.AbstractC0974l
    /* renamed from: a */
    public final Fragment mo3639a(int i) {
        return this.f145456b.get(i);
    }

    @Override // androidx.fragment.app.AbstractC0974l
    /* renamed from: b */
    public final long mo3640b(int i) {
        return (long) this.f145457c.get(i).intValue();
    }

    /* renamed from: d */
    public final int mo103730d(int i) {
        return this.f145457c.get(i).intValue();
    }

    /* renamed from: e */
    public final int mo103731e(int i) {
        return this.f145457c.indexOf(Integer.valueOf(i));
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getItemPosition(Object obj) {
        if (this.f145456b.contains(obj)) {
            return this.f145456b.indexOf(obj);
        }
        return -2;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public CharSequence getPageTitle(int i) {
        Integer num = this.f145457c.get(i);
        if (this.f145456b.get(i) instanceof AbstractC63989ar) {
            return ((AbstractC63989ar) this.f145456b.get(i)).mo65197c();
        }
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                if (intValue != 2) {
                    if (intValue != 3) {
                        if (intValue == 8) {
                            return C34722h.m70923b(R.string.ah9);
                        }
                        if (intValue == 16) {
                            return C34722h.m70923b(R.string.ah2);
                        }
                        if (intValue == 19) {
                            return C34722h.m70923b(R.string.c4o);
                        }
                        if (intValue == 26) {
                            return C34722h.m70923b(R.string.aiv);
                        }
                        switch (intValue) {
                            case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                                return C34722h.m70923b(R.string.ah4);
                            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                                return C34722h.m70923b(R.string.ah7);
                            case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                                return C34722h.m70923b(R.string.bvp);
                            default:
                                return "";
                        }
                    } else if (this.f145456b.get(i) != null && this.f145456b.get(i).f81623x) {
                        return C34722h.m70923b(R.string.an8);
                    }
                }
            }
            return C34722h.m70923b(R.string.c0g);
        }
        if (this.f145456b.get(i) == null || !this.f145456b.get(i).f81623x) {
            return C34722h.m70923b(R.string.caj);
        }
        return C34722h.m70923b(R.string.an8);
    }

    public C64117cn(AbstractC0952i iVar, List<T> list, List<Integer> list2) {
        super(iVar);
        this.f145456b = list;
        this.f145457c = list2;
    }
}

package com.p2082ss.android.ugc.aweme.friends.p3022ui;

import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.widget.RelativeLayout;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.p2364a.AbstractC34478k;
import com.p2082ss.android.ugc.aweme.friends.p3013c.AbstractC51482c;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.friends.ui.y */
public abstract class AbstractC51756y extends RelativeLayout {

    /* renamed from: a */
    private SparseArray f119285a;

    static {
        Covode.recordClassIndex(61119);
    }

    /* renamed from: a */
    public View mo87435a(int i) {
        if (this.f119285a == null) {
            this.f119285a = new SparseArray();
        }
        View view = (View) this.f119285a.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f119285a.put(i, findViewById);
        return findViewById;
    }

    public abstract View getRecommendItemView();

    public void setData(User user) {
    }

    public abstract void setEnterFrom(String str);

    public void setIgnoreRecFriendsCardExp(boolean z) {
    }

    public abstract void setListener(AbstractC34478k<User> kVar);

    public void setPageOwner(Object obj) {
        C89219l.m154721d(obj, "");
    }

    public void setPositionInApiList(int i) {
    }

    public void setRecommendAwemeClickListener(AbstractC51482c cVar) {
    }

    public void setRecommendUserType(int i) {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbstractC51756y(Context context, AttributeSet attributeSet, int i) {
        super(context, null, 0);
        C89219l.m154721d(context, "");
    }
}

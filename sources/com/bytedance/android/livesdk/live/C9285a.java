package com.bytedance.android.livesdk.live;

import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.Fragment;
import androidx.p025c.C0484a;
import com.bytedance.android.livesdk.chatroom.p499ui.C7822br;
import com.bytedance.android.livesdk.widget.AbstractC11428i;
import com.bytedance.android.livesdkapi.depend.p680d.AbstractC11652i;
import com.bytedance.android.livesdkapi.p691g.AbstractC11765f;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.covode.number.Covode;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.live.a */
public class C9285a extends AbstractC11428i {

    /* renamed from: a */
    private final AbstractC11765f f22690a;

    /* renamed from: b */
    private final AbstractC11765f.AbstractC11766a f22691b;

    /* renamed from: e */
    public final Map<String, AbstractC11652i> f22692e = new C0484a();

    /* renamed from: f */
    public AbstractC11652i.AbstractC11653a f22693f;

    static {
        Covode.recordClassIndex(10203);
    }

    /* renamed from: a */
    public final void mo15384a() {
        this.f22690a.mo18712b(this.f22691b);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return this.f22690a.mo14898a();
    }

    /* renamed from: b */
    public final AbstractC11652i mo15385b(int i) {
        return this.f22692e.get(mo15386c(i));
    }

    @Override // com.bytedance.android.livesdk.widget.AbstractC11428i
    /* renamed from: c */
    public final String mo15386c(int i) {
        return m17551a(this.f22690a.mo14900a(i));
    }

    @Override // com.bytedance.android.livesdk.widget.AbstractC11428i
    /* renamed from: a */
    public final Fragment mo15383a(int i) {
        C7822br brVar = new C7822br();
        brVar.mo14104a(this.f22690a.mo14900a(i), this.f22690a.mo14904c(i));
        return brVar.mo14130n();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getItemPosition(Object obj) {
        EnterRoomConfig w;
        int a;
        if ((obj instanceof AbstractC11652i) && (w = ((AbstractC11652i) obj).mo14149w()) != null && (a = this.f22690a.mo14899a(w)) >= 0) {
            return a;
        }
        return -2;
    }

    /* renamed from: a */
    private static String m17551a(EnterRoomConfig enterRoomConfig) {
        if (!TextUtils.isEmpty(enterRoomConfig.f28233c.f28338as)) {
            return enterRoomConfig.f28233c.f28338as;
        }
        String str = enterRoomConfig.f28233c.f28301R + "_" + enterRoomConfig.f28232b.f28257a;
        enterRoomConfig.f28233c.f28338as = str;
        return str;
    }

    public C9285a(AbstractC0952i iVar, AbstractC11765f fVar) {
        super(iVar);
        C9287b bVar = new C9287b(this);
        this.f22691b = bVar;
        this.f22690a = fVar;
        fVar.mo18711a(bVar);
    }

    @Override // com.bytedance.android.livesdk.widget.AbstractC11428i, androidx.viewpager.widget.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        AbstractC11652i iVar = (AbstractC11652i) super.instantiateItem(viewGroup, i);
        iVar.mo14118c(i);
        this.f22692e.put(mo15386c(i), iVar);
        iVar.mo14101a(this.f22693f);
        return iVar;
    }

    @Override // com.bytedance.android.livesdk.widget.AbstractC11428i, androidx.viewpager.widget.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        if (obj instanceof AbstractC11652i) {
            AbstractC11652i iVar = (AbstractC11652i) obj;
            iVar.mo14117c();
            this.f22690a.mo15389a(iVar.mo14086A());
            this.f22692e.remove(m17551a(iVar.mo14149w()));
        }
        super.destroyItem(viewGroup, i, obj);
    }
}

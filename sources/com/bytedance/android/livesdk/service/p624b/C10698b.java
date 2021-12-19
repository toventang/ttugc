package com.bytedance.android.livesdk.service.p624b;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.recyclerview.widget.C1445j;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.dialogv2.p516b.C8348d;
import com.bytedance.android.livesdk.gift.model.Prop;
import com.bytedance.android.livesdk.gift.model.p553a.AbstractC8811a;
import com.bytedance.android.livesdk.gift.model.p553a.AbstractC8812b;
import com.bytedance.android.livesdk.model.C9543b;
import com.bytedance.covode.number.Covode;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.service.b.b */
public final class C10698b extends C1445j.AbstractC1447a {

    /* renamed from: a */
    private final List<AbstractC8812b<? extends C9543b>> f25755a;

    /* renamed from: b */
    private final List<AbstractC8812b<? extends C9543b>> f25756b;

    /* renamed from: c */
    private final boolean f25757c = false;

    static {
        Covode.recordClassIndex(12295);
    }

    @Override // androidx.recyclerview.widget.C1445j.AbstractC1447a
    /* renamed from: a */
    public final int mo3768a() {
        return this.f25755a.size();
    }

    @Override // androidx.recyclerview.widget.C1445j.AbstractC1447a
    /* renamed from: b */
    public final int mo3770b() {
        return this.f25756b.size();
    }

    public C10698b(List<AbstractC8812b<? extends C9543b>> list, List<AbstractC8812b<? extends C9543b>> list2) {
        this.f25755a = list;
        this.f25756b = list2;
    }

    /* renamed from: a */
    private static boolean m19262a(ImageModel imageModel, ImageModel imageModel2) {
        if (imageModel == imageModel2) {
            return true;
        }
        if (imageModel == null || imageModel2 == null || !imageModel.getUri().equals(imageModel2.getUri())) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.C1445j.AbstractC1447a
    /* renamed from: b */
    public final boolean mo3771b(int i, int i2) {
        if (this.f25755a.get(i).mo14676d() == this.f25756b.get(i2).mo14676d()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m19263a(AbstractC8812b bVar, AbstractC8812b bVar2) {
        if (!TextUtils.equals(bVar.mo14673a(), bVar2.mo14673a()) || !TextUtils.equals(bVar.mo14674b(), bVar2.mo14674b()) || !m19262a(bVar.mo14675c(), bVar2.mo14675c()) || !m19262a(bVar.mo14678f(), bVar2.mo14678f())) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.C1445j.AbstractC1447a
    /* renamed from: a */
    public final Object mo3769a(int i, int i2) {
        AbstractC8812b<? extends C9543b> bVar = this.f25755a.get(i);
        AbstractC8812b<? extends C9543b> bVar2 = this.f25756b.get(i2);
        if (!m19263a(bVar, bVar2)) {
            return super.mo3769a(i, i2);
        }
        if (!(bVar instanceof C8348d) || !(bVar2 instanceof C8348d)) {
            return super.mo3769a(i, i2);
        }
        Bundle bundle = new Bundle();
        if (((Prop) bVar.f21695b).count != ((Prop) bVar2.f21695b).count) {
            bundle.putString("key_prop_count", String.valueOf(((Prop) bVar2.f21695b).count));
            bundle.putBoolean("key_prop_show_item_combo", this.f25757c);
        }
        return bundle;
    }

    @Override // androidx.recyclerview.widget.C1445j.AbstractC1447a
    /* renamed from: c */
    public final boolean mo3772c(int i, int i2) {
        AbstractC8812b<? extends C9543b> bVar = this.f25755a.get(i);
        AbstractC8812b<? extends C9543b> bVar2 = this.f25756b.get(i2);
        if (!(bVar instanceof C8348d) || !(bVar2 instanceof C8348d)) {
            if ((bVar instanceof AbstractC8811a) && (bVar2 instanceof AbstractC8811a) && ((AbstractC8811a) bVar).mo14677e() != ((AbstractC8811a) bVar2).mo14677e()) {
                return false;
            }
        } else if (((Prop) bVar.f21695b).count != ((Prop) bVar2.f21695b).count) {
            return false;
        }
        return m19263a(bVar, bVar2);
    }
}

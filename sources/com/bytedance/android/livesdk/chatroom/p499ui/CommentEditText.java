package com.bytedance.android.livesdk.chatroom.p499ui;

import android.content.Context;
import android.util.AttributeSet;
import com.bytedance.android.live.design.widget.LiveEditText;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.CommentEditText */
public class CommentEditText extends LiveEditText {

    /* renamed from: a */
    final List<AbstractC7699a> f19076a = new ArrayList();

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.CommentEditText$a */
    interface AbstractC7699a {
        static {
            Covode.recordClassIndex(8483);
        }

        /* renamed from: a */
        void mo13919a();
    }

    static {
        Covode.recordClassIndex(8482);
    }

    public boolean onTextContextMenuItem(int i) {
        boolean onTextContextMenuItem = super.onTextContextMenuItem(i);
        if (i == 16908322 || i == 16908337) {
            for (AbstractC7699a aVar : this.f19076a) {
                aVar.mo13919a();
            }
        }
        return onTextContextMenuItem;
    }

    public CommentEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}

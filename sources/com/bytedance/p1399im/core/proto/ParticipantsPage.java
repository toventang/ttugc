package com.bytedance.p1399im.core.proto;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.internal.utils.C19999h;
import com.google.gson.p2018a.AbstractC27891c;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.internal.Internal;
import java.util.List;
import p4632k.C89427i;

/* renamed from: com.bytedance.im.core.proto.ParticipantsPage */
public final class ParticipantsPage extends Message<ParticipantsPage, Builder> {
    public static final ProtoAdapter<ParticipantsPage> ADAPTER = new ProtoAdapter_ParticipantsPage();
    public static final Long DEFAULT_CURSOR = 0L;
    public static final Boolean DEFAULT_HAS_MORE = false;
    private static final long serialVersionUID = 0;
    @AbstractC27891c(mo46611a = "cursor")
    public final Long cursor;
    @AbstractC27891c(mo46611a = "has_more")
    public final Boolean has_more;
    @AbstractC27891c(mo46611a = "participants")
    public final List<Participant> participants;

    /* renamed from: com.bytedance.im.core.proto.ParticipantsPage$ProtoAdapter_ParticipantsPage */
    static final class ProtoAdapter_ParticipantsPage extends ProtoAdapter<ParticipantsPage> {
        static {
            Covode.recordClassIndex(23393);
        }

        public ProtoAdapter_ParticipantsPage() {
            super(FieldEncoding.LENGTH_DELIMITED, ParticipantsPage.class);
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [com.bytedance.im.core.proto.ParticipantsPage$Builder, com.squareup.wire.Message$Builder] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.p1399im.core.proto.ParticipantsPage redact(com.bytedance.p1399im.core.proto.ParticipantsPage r4) {
            /*
                r3 = this;
                com.bytedance.im.core.proto.ParticipantsPage$Builder r2 = r4.newBuilder()
                java.util.List<com.bytedance.im.core.proto.Participant> r1 = r2.participants
                com.squareup.wire.ProtoAdapter<com.bytedance.im.core.proto.Participant> r0 = com.bytedance.p1399im.core.proto.Participant.ADAPTER
                com.squareup.wire.internal.Internal.redactElements(r1, r0)
                r2.clearUnknownFields()
                com.bytedance.im.core.proto.ParticipantsPage r0 = r2.build()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p1399im.core.proto.ParticipantsPage.ProtoAdapter_ParticipantsPage.redact(com.bytedance.im.core.proto.ParticipantsPage):com.bytedance.im.core.proto.ParticipantsPage");
        }

        public final int encodedSize(ParticipantsPage participantsPage) {
            return Participant.ADAPTER.asRepeated().encodedSizeWithTag(1, participantsPage.participants) + ProtoAdapter.BOOL.encodedSizeWithTag(2, participantsPage.has_more) + ProtoAdapter.INT64.encodedSizeWithTag(3, participantsPage.cursor) + participantsPage.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final ParticipantsPage decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.participants.add(Participant.ADAPTER.decode(protoReader));
                } else if (nextTag == 2) {
                    builder.has_more(ProtoAdapter.BOOL.decode(protoReader));
                } else if (nextTag != 3) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.cursor(ProtoAdapter.INT64.decode(protoReader));
                }
            }
        }

        public final void encode(ProtoWriter protoWriter, ParticipantsPage participantsPage) {
            Participant.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, participantsPage.participants);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, participantsPage.has_more);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, participantsPage.cursor);
            protoWriter.writeBytes(participantsPage.unknownFields());
        }
    }

    /* renamed from: com.bytedance.im.core.proto.ParticipantsPage$Builder */
    public static final class Builder extends Message.Builder<ParticipantsPage, Builder> {
        public Long cursor;
        public Boolean has_more;
        public List<Participant> participants = Internal.newMutableList();

        static {
            Covode.recordClassIndex(23392);
        }

        @Override // com.squareup.wire.Message.Builder
        public final ParticipantsPage build() {
            return new ParticipantsPage(this.participants, this.has_more, this.cursor, super.buildUnknownFields());
        }

        public final Builder cursor(Long l) {
            this.cursor = l;
            return this;
        }

        public final Builder has_more(Boolean bool) {
            this.has_more = bool;
            return this;
        }

        public final Builder participants(List<Participant> list) {
            Internal.checkElementsNotNull(list);
            this.participants = list;
            return this;
        }
    }

    static {
        Covode.recordClassIndex(23391);
    }

    /* Return type fixed from 'com.bytedance.im.core.proto.ParticipantsPage$Builder' to match base method */
    @Override // com.squareup.wire.Message
    public final Message.Builder<ParticipantsPage, Builder> newBuilder() {
        Builder builder = new Builder();
        builder.participants = Internal.copyOf("participants", this.participants);
        builder.has_more = this.has_more;
        builder.cursor = this.cursor;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.squareup.wire.Message
    public final String toString() {
        return "ParticipantsPage" + C19999h.f47538a.mo46674b(this).toString();
    }

    public ParticipantsPage(List<Participant> list, Boolean bool, Long l) {
        this(list, bool, l, C89427i.EMPTY);
    }

    public ParticipantsPage(List<Participant> list, Boolean bool, Long l, C89427i iVar) {
        super(ADAPTER, iVar);
        this.participants = Internal.immutableCopyOf("participants", list);
        this.has_more = bool;
        this.cursor = l;
    }
}

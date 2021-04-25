package edu.bsu.cs.view;

import edu.bsu.cs.model.Revision;

import java.time.format.DateTimeFormatter;

public final class RevisionFormatter implements RevisionInterface{

    public String format(Revision revision) {
        return String.format("On %s, a change was made by %s",
                (DateTimeFormatter.ISO_INSTANT.format(revision.timestamp)).replace("T", " at ").replace("Z",""),
                revision.name);
    }
    
}

package edu.bsu.cs;

import com.google.inject.AbstractModule;
import edu.bsu.cs.view.RevisionFormatter;
import edu.bsu.cs.view.RevisionInterface;


public class RevisionFormatterModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(RevisionInterface.class).to(RevisionFormatter.class);
    }
}

package com.iiht.yaksha.fsdpa.notesapp.boundary;

import static com.iiht.yaksha.fsdpa.notesapp.testutils.TestUtils.currentTest;
import static com.iiht.yaksha.fsdpa.notesapp.testutils.TestUtils.boundaryTestFile;
import static com.iiht.yaksha.fsdpa.notesapp.testutils.TestUtils.yakshaAssert;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import com.iiht.yaksha.fsdpa.notesapp.exceptions.InvalidNoteIdException;
import com.iiht.yaksha.fsdpa.notesapp.exceptions.InvalidNoteStatusException;
import com.iiht.yaksha.fsdpa.notesapp.model.Note;
import com.iiht.yaksha.fsdpa.notesapp.repo.NoteRepository;
import com.iiht.yaksha.fsdpa.notesapp.service.NoteService;
import com.iiht.yaksha.fsdpa.notesapp.service.NoteServiceImpl;
import com.iiht.yaksha.fsdpa.notesapp.testutils.JsonUtils;


@ExtendWith(SpringExtension.class)
public class BoundaryTests {
	
	@Test
	public void testAuthorNameLength() throws Exception {

		Note note1 = JsonUtils.createNote((long) 10009, "Praveen", "Java", "Done", "Object Oriented Programming");
		int maxChar = 3;
		boolean authorLength = ((note1.getAuthor().length()) >= maxChar);
		 yakshaAssert(currentTest(),(authorLength?true:false),boundaryTestFile);

	}
	
	@Test
	public void testNotesTitleLength() throws Exception {
		Note note1 = JsonUtils.createNote((long) 10009, "Praveen", "Java", "Done", "Object Oriented Programming");
		int maxChar = 3;
		boolean titleLength = ((note1.getTitle().length()) >= maxChar);
		 yakshaAssert(currentTest(),(titleLength?true:false),boundaryTestFile);

	}
  }

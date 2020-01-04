package com.intern.Internship.service;

import com.intern.Internship.model.Feedback;
import com.intern.Internship.model.dto.FeedbackDTO;

public interface FeedbackService {
    FeedbackDTO save(FeedbackDTO feedbackDTO);

    Feedback findById(String feedbackId);

    void delete(Feedback feedback);
}

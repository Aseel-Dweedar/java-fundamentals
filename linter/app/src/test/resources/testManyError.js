it('untransforms mongodb number types', done => {
  const input = {
   long: mongodb.Long.fromNumber(Number.MAX_SAFE_INTEGER)
   double: new mongodb.Double(Number.MAX_VALUE)
  };
  const output = transform.mongoObjectToParseObject(null, input, {
   fields: {
    long: { type: 'Number' }
    double: { type: 'Number' }
   }
  });
  expect(output.long).toBe(Number.MAX_SAFE_INTEGER)
  expect(output.double).toBe(Number.MAX_VALUE)
  done();
 });

 dispatch(remove({ id: subscription.id }))
    .then(response => {
     if (response.data.errors && response.data.errors.length > 0) {
      dispatch(messageShow(response.data.errors[0].message))

      this.loading(false)
     } else {
      dispatch(messageShow('Unsubscribed successfully.'))

      onSuccessUnsubscribe()
     }
    })
    .catch(() => {
     dispatch(messageShow('There was some error unsubscribing. Please try again.'))

     this.loading(false)
    });